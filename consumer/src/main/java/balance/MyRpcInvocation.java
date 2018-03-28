package balance;

import com.alibaba.dubbo.rpc.RpcInvocation;

/**
 * create by sunkx on 2018/3/28
 */

public class MyRpcInvocation extends RpcInvocation {

    private  String flag ;


    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
