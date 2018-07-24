package com.zf.webproject.vote.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**  
* @ClassName: LoginController  
* @Description: 用户操作
* @author zhangfei 
* @date 2018年7月16日 下午5:12:33  
*    
*/
@RestController
@RequestMapping(value="/user")
public class LoginController {
	
	/**  
	* @Title: login  
	* @Description: 登陆
	* @param @return    设定文件  
	* @return String    返回类型  
	* @throws  
	*/
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ApiOperation(value="登陆",notes="需要带验证码")
	@ApiImplicitParams({
		@ApiImplicitParam(dataType = "string",name = "userName",value = "用户名",required = true,paramType = "body"),
		@ApiImplicitParam(dataType = "string",name = "password",value = "用户密码",required = true,paramType = "body")
})
	public String login(@RequestBody String userName,String password) {
		return null;
	}

}
