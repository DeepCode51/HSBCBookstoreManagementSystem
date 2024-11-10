package com.beauty.config;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 支付宝配置
 */
public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2016102500756365";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCXhg2BxeS8nMCqkHbPBMo4PG11qlvdU5aWwnlk3krDGS1QGw+pT5rj36p5EUuUGl9qNWo+VBsmlQ3uvdatILcFz5ETY1Eg7WZ6X4Xs5rdchfpfpKCMMKmL9HALDKAxyhLZ6JhPCJqGXgBK/dR0D4FGYGYy0bDX9B64g9nIIV1vzU+YgTYg669yeiVldGYx8vKhzcB8M7qiJwsMk+bbp93EssKXxvVrwBYxAyTGBITKI3p70f+5Cf9kwr8SV4GRhGdK6d4q3BL3XhTxk9ZgV4E5pPultwZUCNxuJvuEKIg76hDdYc3hSHdHgOZJ22FLIRJPxh/9dQ4vmrbOEYVWqgHhAgMBAAECggEAAKw8tR3O1TOQ+3DmxiaMS1GhXsth2wq6+XJlnZgLFvCurdNg72yGEIr2s9Dq1/6B+/O+xAYVlMdGp4+6O0yQ43q3dzGSs6W6NcLk0ld36vZBVVliyRySNCfis3nb4Dy4drU8r+Um4n/aWnrkDZvgBBL7gTBDK8JOvJ0BQ406X/u0nXhjkemQyNueQL6f8nR0KS5SpMj1QDLhgGzxdJh6h5dHY2XjDjSCDl+urUeZ2pfLNZjp2DI03Sra80fgKmhzqCK+GjetMU4tRM4vMxGnicAft0lOFqGthGjE90alm+c9jo9ZaGmtTNmjh792l0mxkmz6LCGk+qnlxeaBfUCtvQKBgQDvXplTtfVAW1DZxYViM74k8oKlZ0bUZUATA73fMVTpx9n8BDdg/FGVEYOmvQ23XS/q3xJBUPkN9+XcjlzE+G5yG9JusXEX6RuEnZWiUEVP5lMu946xb8w+TEGWQCiH8CFOgLqsGJvquy/BUuzwe08x+SuerGCPGCodoEYkZCBjuwKBgQCiDQlHUjYKbeZWvfOveCKq0S1ZcobR3cauv21yhI3I0eihCFJ615+KBjdPcWgrYrRlCptJToJf8RGQlNjqGBpMo75frKLsHcUjQf/1YSJfmDxGmefIMPqB55UCsk5l3DEKrMpZangEm1Ny64AtSrsgdAfx03DFMtHdGG+LYv6hEwKBgQDlcxOch434y8+bgFgUQy8gMYqETJQ7onaiA3MtEBeqJNVSWyROhm8Zanl9Cjmsq9nz1TKlg53JAvjGy3wnn1AXd43mZ5bV6bBkFb5KoZFfPpQ8MDcK5PSuPuCbyxJPBCKZIpJNxyUmA5qKQRg4iKroZ0WlyuygHfS5A1pZJdVaYwKBgEs8+j3e8bBN7k//yZCCmrXsgL2y6t2ttn2T62DsIlhG/Vcm4gSe8DfJQwzjfpYGMfNnxUl35hhdeOZD9aJapntG2zDYmpw+BjWkgw6OlsMDj5jIBFFyTBzcRNcHqlaosSxfpWN2h1q8MzZ8GPruY4th0/53STiFq+KXYdK5l7d5AoGBAObgrCLjPFiwf9FN6mHmLVNsD39jAqr2BfyBT0YNafoz1nWSGV/hNLewJCeiKwf3HMDY9l0KqG8R5/VoR0egKiWV9oAckm6hXpXfuHwNcIpJAdZRiZkxluklDcBRsTVloxDJXn6ASGds69pfCBO4VzMqWbyK1TPi5MV+eRDLjq1/";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAm272sbjWkUaDP6o2Z050TUp4Pw1g65MKxLZokz7MSlYguvFxvVvmwM1QY8i4Mg/pKLsh8j/I+iJRQwAXMZfXzzvOmWER/V05Aw6R64elybyInKy3cPe883Ttclnfs4IVFGCAJUEkTlon1Qm0NyhTw4yOPU/RqltyGmpkDw4SKKYVx/69O2kbjyPp/RQeKybj1ZwDQpcKYfiWuL1kx3tlzL+nShX+rB9NUNCUpZhIgwGvMazTZQuhwj/OixS7sMjbdZHBm5VYh35RiuNCaLj5hfptM39LyAk70AZRoU3Xn64wVsHbC4nstWgnfFg4tVpzmxmHEbfbKrNmm+5wQOkccQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "";

    // 签名方式
    public static String SIGN_TYPE = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String GATEWAYURL = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\home\\beauty";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
