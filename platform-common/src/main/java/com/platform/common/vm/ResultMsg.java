package com.platform.common.vm;

/**
 * 处理返回信息
 */
public class ResultMsg {

    /**
     * 返回状态码
     */
    private int status;

    /**
     * 返回提示信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
