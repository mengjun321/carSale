package com.hzit.controller;

import com.hzit.common.MyConst;
import com.hzit.entity.Adminlog;
import com.hzit.entity.Company;
import com.hzit.entity.Employee;
import com.hzit.service.IAdminlogService;
import com.hzit.service.ICompanyService;
import com.hzit.service.IEmployeeService;
import com.hzit.util.PhoneMessageUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {
    Logger logger = LogManager.getLogger();
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private ICompanyService companyService;
    @Autowired
    private IAdminlogService adminlogService;
    PhoneMessageUtil phoneMessageUtil = new PhoneMessageUtil();
    private Map<String,Object> resultMap = new HashMap<>();

    @RequestMapping("/goMain.action")
    public ModelAndView goMain(Integer empId){
        Employee employee = employeeService.selectEmployeeById(empId);
        Integer positionId = employee.getPositionId();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("emp",employee);
        if (positionId== MyConst.ADMINPOSITION){
            modelAndView.setViewName("AdminMain");
        }else if (positionId==MyConst.EMPPOSITION){
            modelAndView.setViewName("EmpMain");
        }
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(empId);
        adminlog.setCompanyId(employee.getCompanyId());
        adminlog.setLogContent("访问首页");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("访问首页日志+"+i);

        return modelAndView;
    }


    @RequestMapping("/getCompanyId.action")
    @ResponseBody
    public Company getCompany(String companyName){
        Company company = new Company();
        company.setCompanyName(companyName);
        Company company1 = companyService.selectCompanyByObj(company);
        return company1;
    }

    @RequestMapping("/isLoginSuccess.action")
    @ResponseBody
    public Map<String,Object> isLoginSuccess(Employee employee){
        Employee employee1 = employeeService.selectEmployeeByObj(employee);
        String s = (employee1 != null) ? "true" : "false";
        if (s.equals("true")){
            Adminlog adminlog = new Adminlog();
            adminlog.setCompanyId(employee1.getCompanyId());
            adminlog.setEmpId(employee1.getEmpId());
            adminlog.setLogContent("登录系统");
            adminlog.setLogTime(new Date());
            int i = adminlogService.insertAdminlog(adminlog);
            logger.debug("登录日志+"+i);
            resultMap.put("resultLogin",employee1.getEmpId());
        }else{
            resultMap.put("resultLogin",s);
        }
        return resultMap;
    }
    @RequestMapping("/isExistCompanyName.action")
    @ResponseBody
    public Map<String,Object> isExistCompanyName(String companyName){
        Company company = new Company();
        company.setCompanyName(companyName);
        Company company1 = companyService.selectCompanyByObj(company);
        String s =(company1 != null) ? "true" : "false";
        resultMap.put("resultName",s);
        return resultMap;
    }
    @RequestMapping("/isExistEmpName.action")
    @ResponseBody
    public Map<String,Object> isExistEmpName(String empName){
        Employee employee = new Employee();
        employee.setEmpName(empName);
        Employee employee1 = employeeService.selectEmployeeByObj(employee);
        String s = (employee1 != null) ? "true" : "false";

        resultMap.put("resultName",s);
        return resultMap;
    }
    @RequestMapping("/isExistEmpPhone.action")
    @ResponseBody
    public Map<String,Object> isExistEmpPhone(Integer companyId,String empPhone){
        Employee employee = new Employee();
        employee.setCompanyId(companyId);
        employee.setEmpPhone(empPhone);
        Employee employee1 = employeeService.selectEmployeeByObj(employee);
        String s = (employee1 != null) ? "true" : "false";

        resultMap.put("resultName",s);
        return resultMap;
    }
    @RequestMapping("/insertCompany.action")
    @ResponseBody
    public Company insertCompany(String companyName){
        Company company = new Company();
        company.setCompanyName(companyName);
        int i = companyService.insertCompany(company);
        Company company2 = null;
        if (i>0){
            company2 = companyService.selectCompanyByObj(company);
        }

        return company2;
    }


    @RequestMapping("/isRegisterSuccess.action")
    @ResponseBody
    public Map<String,Object> isRegisterSuccess(Employee employee){
        int i = employeeService.insertEmployee(employee);

        String s = (i>0) ? "true" : "false";
        resultMap.put("resultRegister",s);
        return resultMap;
    }

    /**
     * @description: 给注册手机发送短信验证码
     * @param: empPhoneNumber：员工注册手机号码
     * @return: Map<String, String>
     * @author: Altman
     * @date: 2018-05-03 23:17
     **/
    @RequestMapping("/sendPhoneMesseger")
    @ResponseBody
    public Map<String, Object> sendPhoneMesseger(String empPhoneNumber){
        logger.debug("开始--发送手机短信的方法");

        String authcode = phoneMessageUtil.genRandomNum(4);
        logger.debug("手机验证码,生成验证码:"+authcode);

        if(phoneMessageUtil.sandMassage(authcode,empPhoneNumber)){
            logger.debug("验证码发送成功,发送号码:"+empPhoneNumber);
            resultMap.put("resultRegister",authcode);
        }else{
            logger.debug("验证码发送失败,发送号码:"+empPhoneNumber);
            resultMap.put("resultRegister","1234");
        }

        logger.debug("结束--发送手机短信的方法");
        return resultMap;
    }
}
