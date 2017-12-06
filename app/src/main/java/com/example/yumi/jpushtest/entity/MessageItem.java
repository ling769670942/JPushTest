package com.example.yumi.jpushtest.entity;

/**
 * Created by CimZzz(王彦雄) on 2017/12/6.<br>
 * Since : 项目名称_版本 <br>
 * Description : <br>
 * 描述
 */

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;

@RealmClass
public class MessageItem extends RealmObject{
    @PrimaryKey
    public long id;
    public long createTime;
    public String fromUser;
    public String toUser;
    public int status;
    public int type;
    public String jsonData;
}
