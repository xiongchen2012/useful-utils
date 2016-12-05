package cn.deathdealer.regex;

/**
 * @author: Deathdealer
 * @created_at: 2016/12/06 0:12 正则表达式工具类
 */
public final class RegexUtils {

  /**
   * 本正则表达式可以准确判断是否为中国大陆手机号码；
   * <li>中国移动：134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188
   * <li>中国电信：133、153、173、177、180、181、189
   * <li>中国联通：130、131、132、145、155、156、175、176185、186
   * <li>虚拟运营商：170
   * <li>全球星：1349
   */
  public static final String PATTERN_MOBILE =
      "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|(147))\\d{8}$";

  /** 本正则表达式可以准确判断是否为正确的EMail地址； */
  public static final String PATTERN_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

  /** 本正则表达式可以准确判断是否为正确的IP地址； */
  public static final String PATTERN_IP =
      "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";

  private RegexUtils() {
    throw new AssertionError("you can not instantiate me");
  }
}
