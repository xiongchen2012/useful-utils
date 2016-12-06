/*
 * MIT License
 *
 * Copyright (c) 2016 Deathdealer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package cn.deathdealer.regex;

/**
 * @author: Deathdealer
 * @created_at: 2016/12/06 0:12 正则表达式工具类
 */
public final class RegexUtils {

  /**
   * 本正则表达式准确判断是否为中国大陆手机号码；
   * <li>中国移动：134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188
   * <li>中国电信：133、153、173、177、180、181、189
   * <li>中国联通：130、131、132、145、155、156、175、176185、186
   * <li>虚拟运营商：170
   * <li>全球星：1349
   */
  public static final String PATTERN_MOBILE =
      "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|(147))\\d{8}$";

  /** 本正则表达式准确判断EMail地址； */
  public static final String PATTERN_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

  /** 本正则表达式判断是否为IP地址； */
  public static final String PATTERN_IP =
      "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";

  /** 本正则表达式判断是否为IPv4地址； */
  public static final String PATTERN_IP4 =
      "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

  /** 本正则表达式判断是否为IPv6地址； */
  public static final String PATTERN_IP6 =
      "^(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))$";

  public static final String PATTERN_MORSE =
      "^[.-]{1,5}(?:[ \t]+[.-]{1,5})*(?:[ \t]+[.-]{1,5}(?:[ \t]+[.-]{1,5})*)*$";

  /** 本正则表达式判断是否为HTML标签 */
  public static final String PATTERN_HTML = "^<([a-z1-6]+)([^<]+)*(?:>(.*)<\\/\\1>| *\\/>)$";

  /** 正整数 */
  public static final String PATTERN_POSITIVE_INTEGER = "^\\d+$";

  /** 正数 */
  public static final String PATTERN_POSITIVE_NUMBER = "^\\d*\\.?\\d+$";

  /** 负整数 */
  public static final String PATTERN_NEGATIVE_INTEGER = "^-\\d+$";

  /** 负数 */
  public static final String PATTERN_NEGATIVE_NUMBER = "^-\\d*\\.?\\d+$";

  private RegexUtils() {
    throw new AssertionError("you do not need instantiate " + getClass().getName() + " manually.");
  }
}
