/*
 *
 *  * MIT License
 *  *
 *  * Copyright (c) 2016 deathdealer
 *  *
 *  * Permission is hereby granted, free of charge, to any person obtaining a copy
 *  * of this software and associated documentation files (the "Software"), to deal
 *  * in the Software without restriction, including without limitation the rights
 *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  * copies of the Software, and to permit persons to whom the Software is
 *  * furnished to do so, subject to the following conditions:
 *  *
 *  * The above copyright notice and this permission notice shall be included in all
 *  * copies or substantial portions of the Software.
 *  *
 *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  * SOFTWARE.
 *
 *
 */

package cn.deathdealer.regex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;
import static org.junit.Assert.*;
/**
 * @author: deathdealer
 * @created_at: 2016/12/6
 */
public class RegexUtilsTest {
  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testPATTERN_MOBILE() throws Exception {
    Pattern pattern = Pattern.compile(RegexUtils.PATTERN_EMAIL);
    assertTrue(
        "xiongchen2046@163.com is valid", pattern.matcher("xiongchen2046@163.com").matches());
    assertFalse("xiongchen2046@163 is NOT valid", pattern.matcher("xiongchen2046@163").matches());
    assertTrue("Pxiongchen2046@163.cn is valid", pattern.matcher("xiongchen2046@163.cn").matches());
    assertFalse(
        "xiongchen2046163.cn is NOT valid", pattern.matcher("xiongchen2046163.cn").matches());
    assertFalse("xiongchen2046@cn is NOT valid", pattern.matcher("xiongchen2046@cn").matches());
    assertFalse("@163.cn is NOT valid", pattern.matcher("@163.cn").matches());
    assertTrue("UPPERCASE@163.cn is valid", pattern.matcher("UPPERCASE@163.cn").matches());
    assertTrue("UPPERCASE-2@163.cn is valid", pattern.matcher("UPPERCASE-2@163.cn").matches());
    assertTrue("UPPERCASE_2@163.cn is valid", pattern.matcher("UPPERCASE_2@163.cn").matches());
    assertFalse("中文@163.cn is NOT valid", pattern.matcher("中文@163.cn").matches());
    assertFalse(
        "xiongchen2046@新浪.cn is NOT valid", pattern.matcher("xiongchen2046@新浪.cn").matches());
    assertFalse("邮箱@新浪.com is NOT valid", pattern.matcher("邮箱@新浪.com").matches());
    assertFalse(
        "xiongchen2046@163.公司 is NOT valid", pattern.matcher("xiongchen2046@163.公司").matches());
  }
}
