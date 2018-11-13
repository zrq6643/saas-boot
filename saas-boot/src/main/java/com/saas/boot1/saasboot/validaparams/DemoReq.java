package com.saas.boot1.saasboot.validaparams;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/*在web开发时，对于请求参数，一般上都需要进行参数合法性校验的，原先的写法时一个个字段一个个去判断，
这种方式太不通用了，所以java的JSR 303: Bean Validation规范就是解决这个问题的。
        JSR 303只是个规范，并没有具体的实现，目前通常都是才有hibernate-validator进行统一参数校验。
        然后在控制层方法里，加入@Valid即可，这样在访问前，会对请求参数进行检验
        参照地址：http://www.importnew.com/29411.html*/
@Data
public class DemoReq {

    @NotBlank(message="code不能为空")
    String code;

    @Length(max=10,message="name长度不能超过10")
    String name;

    //自定义注解的使用
    @Constant(message = "verson只能为1.0",value="1.0")
    String version;
}
