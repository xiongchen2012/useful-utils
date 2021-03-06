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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: Deathdealer
 * @created_at: 2016/12/05 22:09
 */
public class AlphabetTest {
  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testDigital() throws Exception {
    assertEquals(Alphabet.DIGITAL, "0123456789");
  }

  @Test
  public void testDigitalLength() throws Exception {
    assertTrue("digital must be 10", Alphabet.DIGITAL.length() == 10);
  }

  @Test
  public void testLowerCaseLetters() throws Exception {
    assertEquals(Alphabet.LOWER_CASE_LETTERS, "abcdefghijklmnopqrstuvwxyz");
  }

  @Test
  public void testLowerCaseLettersLength() throws Exception {
    assertTrue("lower case letters must be 26", Alphabet.LOWER_CASE_LETTERS.length() == 26);
  }

  @Test
  public void testUpperCaseLetters() throws Exception {
    assertEquals(Alphabet.UPPER_CASE_LETTERS, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  }

  @Test
  public void testUpperCazseLettersLenght() throws Exception {
    assertTrue("uppper case letters must be 26", Alphabet.UPPER_CASE_LETTERS.length() == 26);
  }

}
