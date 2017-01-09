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

import java.lang.reflect.Constructor;
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

  @Test
  public void testIsMobile() throws Exception {

    /*移动*/
    assertFalse(RegexUtils.isMobile("1928"));
	  assertFalse(RegexUtils.isMobile("12450968299"));
    assertTrue(RegexUtils.isMobile("13450968299"));
    assertTrue(RegexUtils.isMobile("13542744575"));
    assertTrue(RegexUtils.isMobile("13652760984"));
    assertTrue(RegexUtils.isMobile("13790792474"));
    assertTrue(RegexUtils.isMobile("13825443684"));
    assertTrue(RegexUtils.isMobile("13928198152"));
    assertTrue(RegexUtils.isMobile("14778088208"));
    assertTrue(RegexUtils.isMobile("15018671806"));
    assertTrue(RegexUtils.isMobile("15118967564"));
    assertTrue(RegexUtils.isMobile("15220663284"));
    assertTrue(RegexUtils.isMobile("15724004377"));
    assertTrue(RegexUtils.isMobile("15807698504"));
    assertTrue(RegexUtils.isMobile("15918255432"));
    assertTrue(RegexUtils.isMobile("17801800156"));
    assertTrue(RegexUtils.isMobile("18200880529"));
    assertTrue(RegexUtils.isMobile("18318888743"));
    assertTrue(RegexUtils.isMobile("18476456683"));
    assertTrue(RegexUtils.isMobile("18776456683"));
    assertTrue(RegexUtils.isMobile("18814057784"));
  }

  @Test
  public void testIsCNChar() throws Exception {
    assertFalse("english is NOT Chinese", RegexUtils.isCNString("english"));
    assertFalse("10086 is NOT Chinese", RegexUtils.isCNString("10086"));
    assertTrue("中文 is Chinese", RegexUtils.isCNString("中文"));
    assertFalse("中文a is NOT Chinese", RegexUtils.isCNString("中文a"));
    assertFalse("サュモャャハぬなまむ is NOT Chinese", RegexUtils.isCNString("サュモャハぬなまむ"));
  }

	@Test
	public void testIsJPChar() throws Exception {
		assertTrue("サュモャャハぬなまむ is Japanese", RegexUtils.isJPString("サュモャハぬなまむ"));
		assertFalse("中文 is NOT Japanese", RegexUtils.isJPString("中文"));
		assertFalse("string is NOT Japanese", RegexUtils.isJPString("string"));
	}

  @Test
  public void testIsHtml() throws Exception {
  	assertTrue("",RegexUtils.isHtml("<ssss></ssss>"));
  }


}
