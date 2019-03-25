package the.flash.protocol;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public abstract class Packet {
    /**
     * 协议中使用 @JSONField(deserialize = false,
     * serialize = false) 标注 version 不被序列化了哦，所以协议  对象 Packet 不会出现 version
     * 协议版本
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;


    @JSONField(serialize = false)
    public abstract Byte getCommand();
}
