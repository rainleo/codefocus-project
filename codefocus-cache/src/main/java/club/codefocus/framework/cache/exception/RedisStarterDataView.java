package club.codefocus.framework.cache.exception;

import lombok.Data;

/**
 * @author  jackl
 * @Date: 2019/10/25 14:03
 * @Description:
 */
@Data
public class RedisStarterDataView  {
    private Integer code;

    private String message;

    public RedisStarterDataView(RedisStarterExceptionEnum serverLimitException) {
        this.code=serverLimitException.getCode();
        this.message=serverLimitException.getMessage();

    }
}