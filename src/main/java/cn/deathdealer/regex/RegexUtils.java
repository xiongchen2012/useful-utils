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

import java.util.regex.Pattern;

/**
 * @author: Deathdealer
 * @created_at: 2016/12/06 0:12 正则表达式工具类
 */
public final class RegexUtils {

  /* ========================= 字符串常用正则 ========================= */
  /**
   * 手机号码；
   * <li>中国移动：134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188
   * <li>中国电信：133、153、173、177、180、181、189
   * <li>中国联通：130、131、132、145、155、156、175、176185、186
   * <li>虚拟运营商：170
   * <li>全球星：1349
   */
  public static final String PATTERN_MOBILE =
      "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|(147))\\d{8}$";

  /** 电话号码 */
  public static final String PATTERN_TEL = "^0\\d{2,3}[- ]?\\d{7,8}";

  /** email地址； */
  public static final String PATTERN_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

  /** IP地址； */
  public static final String PATTERN_IP =
      "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";

  /** IPv4地址； */
  public static final String PATTERN_IP4 =
      "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

  /** 匹配IPv6地址； */
  public static final String PATTERN_IP6 =
      "^(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))$";

  /** 莫斯码 */
  public static final String PATTERN_MORSE =
      "^[.-]{1,5}(?:[ \t]+[.-]{1,5})*(?:[ \t]+[.-]{1,5}(?:[ \t]+[.-]{1,5})*)*$";

  /** HTML标签 */
  public static final String PATTERN_HTML = "^<([a-z1-6]+)([^<]+)*(?:>(.*)<\\/\\1>| *\\/>)$";

  /** 中国15位身份证号 */
  public static final String PATTERN_ID15 =
      "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$";

  /** 中国18位身份证号 */
  public static final String PATTERN_ID18 =
      "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$";

  /** 汉字 */
  public static final String PATTERN_CN = "^[\\u4e00-\\u9fa5]+$";

  /** 日文 */
  public static final String PATTERN_JP = "^[\\u0800-\\u4e00]+$";

  /** 双字节字符 */
  public static final String PATTERN_DOUBLE_BYTE = "[^\\x00-\\xff]";

  /** 邮政编码 */
  public static final String PATTERN_ZIPCODE = "[1-9]\\d{5}(?!\\d)";

  /* ========================= 数字常用正则 ========================= */
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

  /**
   * 判断输入的字符串是否匹配给定正则表达式
   * @param pattern 正则表达式
   * @param input 要匹配的字符串
   * @return {@code true}: 匹配<br>
   *         {@code false}: 不匹配
   */
  public static boolean isMatch(String pattern, CharSequence input) {
    return input != null && input.length() > 0 && Pattern.matches(pattern, input);
  }
}
