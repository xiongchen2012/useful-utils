/*
 *
 *  * MIT License
 *  *
 *  * Copyright (c) 2017 deathdealer
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

package cn.deathdealer.util;

public class StrUtil {
	
	public static final char DELIMITER_LEFT = '{';
	public static final char DELIMITER_RIGHT = '}';
	public static final char SLASH = '/';
	public static final char BACK_SLASH = '\\';
	
	public static final String PLACE_HOLDER = "{}";
	public static final String EMPTY_JSON = PLACE_HOLDER;
	
	private StrUtil() {
		throw new AssertionError(
				"you do not need to instantiate " + getClass().getName() + " manually.");
	}
	
	/**
	 * 判断字符串是否为空
	 * @param str 字符串
	 * @return true：空字符串<br>false:非空字符串
	 */
	public static boolean isEmpty(CharSequence str) {
		return str == null || str.length() == 0;
	}
	
	/**
	 * 判断字符串是否不为空
	 * @param str 字符串
	 * @return true：非空字符串<br>false:空字符串
	 */
	public static boolean isNotEmpty(CharSequence str){
		return !isEmpty(str);
	}
	
	
}
