/*
 * The MIT License (MIT)
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

package cn.deathdealer;

/**
 * @author: Deathdealer
 * @created_at: 2016/12/05 21:46
 */
public final class Alphabet {

  /* 二进制 {0,1}*/
  public static final String BINARY = "01";

  /* 八进制 {0,1,2,3,4,5,6,7}*/
  public static final String OCTAL = "01234567";

  /* 十进制数字 {0,1,2,3,4,5,6,7,8,9}*/
  public static final String DIGITAL = "0123456789";

  /* 十六进制 {0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F} */
  public static final String HEXA_UPPER = "0123456789ABCDEF";

  /* 小写字母 */
  public static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";

  /* 大写字母 */
  public static final String UPPER_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  /* 数字和字母集合 */
  public static final String DIGITAL_AND_LETTERS =
      DIGITAL + LOWER_CASE_LETTERS + UPPER_CASE_LETTERS;

  private Alphabet() {
    throw new AssertionError("you do not need instance " + getClass().getName() + " manually.");
  }
}
