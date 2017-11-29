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

package cn.deathdealer.reflect;

import sun.misc.Unsafe;
import java.lang.reflect.Field;

/**
 * 获取Unsafe类的实例（JDK中有安全限制） A collection of methods for performing low-level, unsafe operations.
 * Although the class and all methods are public, use of this class islimited because only trusted
 * code can obtain instances of it.
 *
 * <p>Unsafe.getUnsafe()方法仅提供给Bootstrap类加载器使用，直接调用会抛出SecurityException异常
 *
 * @author deathdealer
 * @created_at 2017/11/29
 * @since 1.0
 */
public class UnsafeFactory {

  public static Unsafe getUnsafe() {
    try {
      Field theUnsafeInstance = Unsafe.class.getDeclaredField("theUnsafe");
      theUnsafeInstance.setAccessible(true);
      return (Unsafe) theUnsafeInstance.get(null);
    } catch (Exception e) {
      throw new SecurityException("you could not instantiate \"sun.misc.Unsafe\" manually.");
    }
  }
}
