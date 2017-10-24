package com.alipay.config;

/**
 * Created by Administrator on 2017/10/16.
 */
public class AlipayConfig {
    // 商户appid
    public static String APPID = "2016081600255068";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC6Qlb0tdjDeZsJ61jEI9r2bdRJSBuj+l959pv7wDiWkdS4Xro/yEZHiuUeDnTs/tmgg5MZXvVoeXvM7zdv8DWHroQc/3zf7oBk4L8faTUFaxbEACJLcUf73U/xzMaP3XyLkULp9X+5SHFyK4CHSsbb/tlYpi6y9l9Pfu5UftAJXmMcnfo3COT7q7cr7+v44vkkRenWxjTOuUKHPUapYE/DNRnsWpWrBPGF3gLFUQQYR6bRQwc0I4RBuU7qe0F3x2nx8UdQU5ahtboSXYP1Dewtaj5vTkainjg3OitCEuyqbs+Ye9yqgy0Dnh+pAg0ecEZeqLbideCvKfxnEP5BzvYjAgMBAAECggEAYWttW9T5KVSjeM61wPEYB6huTl3+xwefhIUuFMD3WBmybzRsqguwZp8JM21QTt0FKuVmvPBj318bF5dPIac7+FmZFCm1QNLYKOs8S8uVRd47LAz94wO/KMcal1gJyxmHmOBDZWdYhKqVW6fRM/IyjMKBH9LbvhMKyuOS+HLTkPH+iJx0hhDEx+81eUxDVVRoy/pdsXQp7JTUFdWnhtxQCoVpUWd3jeFiOLAT5GuktKdjY9qd891Yq52lu11DGgPILVLiY2OS9A/7VGln0sQMKPcJWDpl89MRcI++tZup37bF7gs9k9EWhpHA4gd6wT7f6jediiU7WljU6v1+sKX/4QKBgQDnePLpM0ceneoijLwMhdfJu0rmXVk38itRghHD2JBioA9/iTOpCthN8KHHVgmjD3myln12IHkCIQEBoGSJsiCOaGIUC0wtjTe78erGcBrOsr4zMhSlTo959hc1U47c3eBpMiEYt5uBiwK4r96KV6vDwCpN2LyYs9LNleux0q0HCQKBgQDN/ui7SgJt82CKkNIQCp+JFkwXp7cyqG9JUiuqRkpe373ecp7frjFjWskn0a9rbZi79/1fI82LuZRmIvJ6W5g7rTSRCkiAhLgwygEKWjd9CV5H+i0cpN9W8KnrTTYzWmAVfyAzk+rkwYLOO3CjWRNHFpacDG+8lK3lWD65JG3SywKBgA13nwJsZlXksCukboh3/Q8So4/1nGxB3b1XSPtRDU1/rIcqD2RlaiJWvsLfQZ5IFzeJw/DsgL3b97gFgfP09iny7snlwl/gGH8J2zQCb7zY73IBFuxrPrPE2qLSorw8+IKGVSCgBh8qXFUsflEkOq0f8BYpZwenZrtpXpYxALopAoGBAL/d+APKMW0bzQYDUcUjP+k93W4DBv2mKNGQOZ+FjOvFVmIFPLl21AWIn+f4xH05PZOGrnaZMHA+UFy5nEQfYDHlaBrYCyO5ep3m6QUtdpV9zlUYTkBpyKR/0KSb7Cn0uZ4MJIAl/BlJrH5OmuFqrCwAfBOo+cIaccY2ZWWo6qn1AoGAYav/eVO/sIWSKKea6XhokSvxQ5NJR3pXqCR/PMW2hSmqfeyQn6aoC43CDiYjvBWSx5k230IB1/mdGFdo9M8IlGZ59fSA075PHew8rSRgFMz7k+lf/C30wD2DC6gqZ83Cp5SKGyLQ0YHLsHcHsm373WmkqyHnXbFbhAwIca7r/co=";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://lizhen.free.ngrok.cc/zhifubaozhifu/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://lizhen.free.ngrok.cc/zhifubaozhifu/return_url.jsp";
    // 请求网关地址 (此处是沙箱网址)
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String CHARSET = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥(TODO 当填写应用公钥之后,相应的就可以查看支付宝公钥了,应用公钥与支付宝公钥是完全不同的两个参数)
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA5gLwG6ecSPt9MY98ovZJ5QwA6ykIwvFG99MBRucJVurkGJ76A8joeMQMxV8cNMoDDo1l1VuxFWStzJhtia4PmCZVRq1HyTx24kRNQzOSM2FETew9ds6V5KMw8jf8SIndnstYgTgfnnfSWhq0MGjO57ZaRvTmxlW04YA/pLmSq01/LIk9Ye2DgMdTFY4lZAQna9qJuoQVbwNAQeDvx8tA2a9/vrGDcreAkVBUwfwLoxQBE8rvm28KE2g0v3VZJee+cJfIse401djv756qIErUewLNNxfZXeDbcaK5vT27ViJjoTXhzyn9cKDs9fgaceJrjEBTGQoGHYMmOrbGVzPGGQIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2 (生成签名与验签所用方式相同)
    public static String SIGNTYPE = "RSA2";



}
