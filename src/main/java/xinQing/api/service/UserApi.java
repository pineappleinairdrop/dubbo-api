package xinQing.api.service;

import xinQing.api.dto.UserDto;

import java.util.List;

/**
 * dubbo暴露的服务接口
 *
 */
/*公共接口命名为XXXApi，以免与springMVC的XXXService混淆*/
public interface UserApi {

    /* 真实情况肯定是分页的 */
    List<UserDto> findAll();

}
