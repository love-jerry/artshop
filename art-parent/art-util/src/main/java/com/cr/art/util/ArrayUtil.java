package com.cr.art.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
* @ClassName: ArrayUtil 
* @Description: 数组工具类
* @author chenrui <chenrui@cstonline.cn> 
* @date 2014-4-23 下午5:22:25 
*
 */
public class ArrayUtil
{
  public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];

  @SuppressWarnings("rawtypes")
public static final Class[] EMPTY_CLASS_ARRAY = new Class[0];

  public static final String[] EMPTY_STRING_ARRAY = new String[0];

  public static final long[] EMPTY_LONG_ARRAY = new long[0];

  public static final Long[] EMPTY_LONG_OBJECT_ARRAY = new Long[0];

  public static final int[] EMPTY_INT_ARRAY = new int[0];

  public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY = new Integer[0];

  public static final short[] EMPTY_SHORT_ARRAY = new short[0];

  public static final Short[] EMPTY_SHORT_OBJECT_ARRAY = new Short[0];

  public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

  public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY = new Byte[0];

  public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];

  public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY = new Double[0];

  public static final float[] EMPTY_FLOAT_ARRAY = new float[0];

  public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY = new Float[0];

  public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];

  public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = new Boolean[0];

  public static final char[] EMPTY_CHAR_ARRAY = new char[0];

  public static final Character[] EMPTY_CHARACTER_OBJECT_ARRAY = new Character[0];

  public static boolean isEmpty(Object[] array)
  {
    return (array == null) || (array.length == 0);
  }

  public static boolean isEmpty(long[] array)
  {
    return (array == null) || (array.length == 0);
  }

  public static boolean isEmpty(int[] array)
  {
    return (array == null) || (array.length == 0);
  }

  public static boolean isEmpty(short[] array)
  {
    return (array == null) || (array.length == 0);
  }

  public static boolean isEmpty(byte[] array)
  {
    return (array == null) || (array.length == 0);
  }

  public static boolean isEmpty(double[] array)
  {
    return (array == null) || (array.length == 0);
  }

  public static boolean isEmpty(float[] array)
  {
    return (array == null) || (array.length == 0);
  }

  public static boolean isEmpty(boolean[] array)
  {
    return (array == null) || (array.length == 0);
  }

  public static boolean isEmpty(char[] array)
  {
    return (array == null) || (array.length == 0);
  }

  public static boolean isNotEmpty(Object[] array)
  {
    return (array != null) && (array.length > 0);
  }

  public static boolean isNotEmpty(long[] array)
  {
    return (array != null) && (array.length > 0);
  }

  public static boolean isNotEmpty(int[] array)
  {
    return (array != null) && (array.length > 0);
  }

  public static boolean isNotEmpty(short[] array)
  {
    return (array != null) && (array.length > 0);
  }

  public static boolean isNotEmpty(byte[] array)
  {
    return (array != null) && (array.length > 0);
  }

  public static boolean isNotEmpty(double[] array)
  {
    return (array != null) && (array.length > 0);
  }

  public static boolean isNotEmpty(float[] array)
  {
    return (array != null) && (array.length > 0);
  }

  public static boolean isNotEmpty(boolean[] array)
  {
    return (array != null) && (array.length > 0);
  }

  public static boolean isNotEmpty(char[] array)
  {
    return (array != null) && (array.length > 0);
  }

  public static Object[] defaultIfNull(Object[] array)
  {
    return array == null ? EMPTY_OBJECT_ARRAY : array;
  }

  public static long[] defaultIfNull(long[] array)
  {
    return array == null ? EMPTY_LONG_ARRAY : array;
  }

  public static int[] defaultIfNull(int[] array)
  {
    return array == null ? EMPTY_INT_ARRAY : array;
  }

  public static short[] defaultIfNull(short[] array)
  {
    return array == null ? EMPTY_SHORT_ARRAY : array;
  }

  public static byte[] defaultIfNull(byte[] array)
  {
    return array == null ? EMPTY_BYTE_ARRAY : array;
  }

  public static double[] defaultIfNull(double[] array)
  {
    return array == null ? EMPTY_DOUBLE_ARRAY : array;
  }

  public static float[] defaultIfNull(float[] array)
  {
    return array == null ? EMPTY_FLOAT_ARRAY : array;
  }

  public static boolean[] defaultIfNull(boolean[] array)
  {
    return array == null ? EMPTY_BOOLEAN_ARRAY : array;
  }

  public static char[] defaultIfNull(char[] array)
  {
    return array == null ? EMPTY_CHAR_ARRAY : array;
  }

  public static Object[] defaultIfNull(Object[] array, Object[] defaultArray)
  {
    return array == null ? defaultArray : array;
  }

  public static long[] defaultIfNull(long[] array, long[] defaultArray)
  {
    return array == null ? defaultArray : array;
  }

  public static int[] defaultIfNull(int[] array, int[] defaultArray)
  {
    return array == null ? defaultArray : array;
  }

  public static short[] defaultIfNull(short[] array, short[] defaultArray)
  {
    return array == null ? defaultArray : array;
  }

  public static byte[] defaultIfNull(byte[] array, byte[] defaultArray)
  {
    return array == null ? defaultArray : array;
  }

  public static double[] defaultIfNull(double[] array, double[] defaultArray)
  {
    return array == null ? defaultArray : array;
  }

  public static float[] defaultIfNull(float[] array, float[] defaultArray)
  {
    return array == null ? defaultArray : array;
  }

  public static boolean[] defaultIfNull(boolean[] array, boolean[] defaultArray)
  {
    return array == null ? defaultArray : array;
  }

  public static char[] defaultIfNull(char[] array, char[] defaultArray)
  {
    return array == null ? defaultArray : array;
  }

  public static Object[] defaultIfEmpty(Object[] array)
  {
    return array == null ? EMPTY_OBJECT_ARRAY : array;
  }

  public static long[] defaultIfEmpty(long[] array)
  {
    return array == null ? EMPTY_LONG_ARRAY : array;
  }

  public static int[] defaultIfEmpty(int[] array)
  {
    return array == null ? EMPTY_INT_ARRAY : array;
  }

  public static short[] defaultIfEmpty(short[] array)
  {
    return array == null ? EMPTY_SHORT_ARRAY : array;
  }

  public static byte[] defaultIfEmpty(byte[] array)
  {
    return array == null ? EMPTY_BYTE_ARRAY : array;
  }

  public static double[] defaultIfEmpty(double[] array)
  {
    return array == null ? EMPTY_DOUBLE_ARRAY : array;
  }

  public static float[] defaultIfEmpty(float[] array)
  {
    return array == null ? EMPTY_FLOAT_ARRAY : array;
  }

  public static boolean[] defaultIfEmpty(boolean[] array)
  {
    return array == null ? EMPTY_BOOLEAN_ARRAY : array;
  }

  public static char[] defaultIfEmpty(char[] array)
  {
    return array == null ? EMPTY_CHAR_ARRAY : array;
  }

  public static Object[] defaultIfEmpty(Object[] array, Object[] defaultArray)
  {
    return (array == null) || (array.length == 0) ? defaultArray : array;
  }

  public static long[] defaultIfEmpty(long[] array, long[] defaultArray)
  {
    return (array == null) || (array.length == 0) ? defaultArray : array;
  }

  public static int[] defaultIfEmpty(int[] array, int[] defaultArray)
  {
    return (array == null) || (array.length == 0) ? defaultArray : array;
  }

  public static short[] defaultIfEmpty(short[] array, short[] defaultArray)
  {
    return (array == null) || (array.length == 0) ? defaultArray : array;
  }

  public static byte[] defaultIfEmpty(byte[] array, byte[] defaultArray)
  {
    return (array == null) || (array.length == 0) ? defaultArray : array;
  }

  public static double[] defaultIfEmpty(double[] array, double[] defaultArray)
  {
    return (array == null) || (array.length == 0) ? defaultArray : array;
  }

  public static float[] defaultIfEmpty(float[] array, float[] defaultArray)
  {
    return (array == null) || (array.length == 0) ? defaultArray : array;
  }

  public static boolean[] defaultIfEmpty(boolean[] array, boolean[] defaultArray)
  {
    return (array == null) || (array.length == 0) ? defaultArray : array;
  }

  public static char[] defaultIfEmpty(char[] array, char[] defaultArray)
  {
    return (array == null) || (array.length == 0) ? defaultArray : array;
  }

  public static boolean equals(Object array1, Object array2)
  {
    if (array1 == array2) {
      return true;
    }

    if ((array1 == null) || (array2 == null)) {
      return false;
    }

    @SuppressWarnings("rawtypes")
	Class clazz = array1.getClass();

    if (!clazz.equals(array2.getClass())) {
      return false;
    }

    if (!clazz.isArray()) {
      return array1.equals(array2);
    }

    if ((array1 instanceof long[])) {
      long[] longArray1 = (long[])(long[])array1;
      long[] longArray2 = (long[])(long[])array2;

      if (longArray1.length != longArray2.length) {
        return false;
      }

      for (int i = 0; i < longArray1.length; i++) {
        if (longArray1[i] != longArray2[i]) {
          return false;
        }
      }

      return true;
    }if ((array1 instanceof int[])) {
      int[] intArray1 = (int[])(int[])array1;
      int[] intArray2 = (int[])(int[])array2;

      if (intArray1.length != intArray2.length) {
        return false;
      }

      for (int i = 0; i < intArray1.length; i++) {
        if (intArray1[i] != intArray2[i]) {
          return false;
        }
      }

      return true;
    }if ((array1 instanceof short[])) {
      short[] shortArray1 = (short[])(short[])array1;
      short[] shortArray2 = (short[])(short[])array2;

      if (shortArray1.length != shortArray2.length) {
        return false;
      }

      for (int i = 0; i < shortArray1.length; i++) {
        if (shortArray1[i] != shortArray2[i]) {
          return false;
        }
      }

      return true;
    }if ((array1 instanceof byte[])) {
      byte[] byteArray1 = (byte[])(byte[])array1;
      byte[] byteArray2 = (byte[])(byte[])array2;

      if (byteArray1.length != byteArray2.length) {
        return false;
      }

      for (int i = 0; i < byteArray1.length; i++) {
        if (byteArray1[i] != byteArray2[i]) {
          return false;
        }
      }

      return true;
    }if ((array1 instanceof double[])) {
      double[] doubleArray1 = (double[])(double[])array1;
      double[] doubleArray2 = (double[])(double[])array2;

      if (doubleArray1.length != doubleArray2.length) {
        return false;
      }

      for (int i = 0; i < doubleArray1.length; i++) {
        if (Double.doubleToLongBits(doubleArray1[i]) != Double.doubleToLongBits(doubleArray2[i]))
        {
          return false;
        }
      }

      return true;
    }if ((array1 instanceof float[])) {
      float[] floatArray1 = (float[])(float[])array1;
      float[] floatArray2 = (float[])(float[])array2;

      if (floatArray1.length != floatArray2.length) {
        return false;
      }

      for (int i = 0; i < floatArray1.length; i++) {
        if (Float.floatToIntBits(floatArray1[i]) != Float.floatToIntBits(floatArray2[i])) {
          return false;
        }
      }

      return true;
    }if ((array1 instanceof boolean[])) {
      boolean[] booleanArray1 = (boolean[])(boolean[])array1;
      boolean[] booleanArray2 = (boolean[])(boolean[])array2;

      if (booleanArray1.length != booleanArray2.length) {
        return false;
      }

      for (int i = 0; i < booleanArray1.length; i++) {
        if (booleanArray1[i] != booleanArray2[i]) {
          return false;
        }
      }

      return true;
    }if ((array1 instanceof char[])) {
      char[] charArray1 = (char[])(char[])array1;
      char[] charArray2 = (char[])(char[])array2;

      if (charArray1.length != charArray2.length) {
        return false;
      }

      for (int i = 0; i < charArray1.length; i++) {
        if (charArray1[i] != charArray2[i]) {
          return false;
        }
      }

      return true;
    }
    Object[] objectArray1 = (Object[])(Object[])array1;
    Object[] objectArray2 = (Object[])(Object[])array2;

    if (objectArray1.length != objectArray2.length) {
      return false;
    }

    for (int i = 0; i < objectArray1.length; i++) {
      if (!equals(objectArray1[i], objectArray2[i])) {
        return false;
      }
    }

    return true;
  }

  public static List<Object> toFixedList(Object[] array)
  {
    if (array == null) {
      return null;
    }

    return Arrays.asList(array);
  }

  @SuppressWarnings("unchecked")
public static List<String> toList(String[] array) {
    if ((null == array) || (0 == array.length)) {
      return null;
    }
    @SuppressWarnings("rawtypes")
	List list = new ArrayList();

    for (String temp : array) {
      list.add(temp);
    }

    return list;
  }


  public static Map<Object, Object> toMap(Object[] array)
  {
    return toMap(array, null);
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
public static Map<Object, Object> toMap(Object[] array, Map<Object, Object> map)
  {
    if (array == null) {
      return map;
    }

    if (map == null) {
      map = new HashMap((int)(array.length * 1.5D));
    }

    for (int i = 0; i < array.length; i++) {
      Object object = array[i];

      if ((object instanceof Map.Entry)) {
        Map.Entry entry = (Map.Entry)object;

        map.put(entry.getKey(), entry.getValue());
      } else if ((object instanceof Object[])) {
        Object[] entry = (Object[])(Object[])object;

        if (entry.length < 2) {
          throw new IllegalArgumentException("Array element " + i + ", '" + object + "', has a length less than 2");
        }

        map.put(entry[0], entry[1]);
      } else {
        throw new IllegalArgumentException("Array element " + i + ", '" + object + "', is neither of type Map.Entry nor an Array");
      }

    }

    return map;
  }

  public static Object[] clone(Object[] array)
  {
    if (array == null) {
      return null;
    }

    return (Object[])array.clone();
  }

  public static long[] clone(long[] array)
  {
    if (array == null) {
      return null;
    }

    return (long[])array.clone();
  }

  public static int[] clone(int[] array)
  {
    if (array == null) {
      return null;
    }

    return (int[])array.clone();
  }

  public static short[] clone(short[] array)
  {
    if (array == null) {
      return null;
    }

    return (short[])array.clone();
  }

  public static byte[] clone(byte[] array)
  {
    if (array == null) {
      return null;
    }

    return (byte[])array.clone();
  }

  public static double[] clone(double[] array)
  {
    if (array == null) {
      return null;
    }

    return (double[])array.clone();
  }

  public static float[] clone(float[] array)
  {
    if (array == null) {
      return null;
    }

    return (float[])array.clone();
  }

  public static boolean[] clone(boolean[] array)
  {
    if (array == null) {
      return null;
    }

    return (boolean[])array.clone();
  }

  public static char[] clone(char[] array)
  {
    if (array == null) {
      return null;
    }

    return (char[])array.clone();
  }

  public static boolean isSameLength(Object[] array1, Object[] array2)
  {
    int length1 = array1 == null ? 0 : array1.length;
    int length2 = array2 == null ? 0 : array2.length;

    return length1 == length2;
  }

  public static boolean isSameLength(long[] array1, long[] array2)
  {
    int length1 = array1 == null ? 0 : array1.length;
    int length2 = array2 == null ? 0 : array2.length;

    return length1 == length2;
  }

  public static boolean isSameLength(int[] array1, int[] array2)
  {
    int length1 = array1 == null ? 0 : array1.length;
    int length2 = array2 == null ? 0 : array2.length;

    return length1 == length2;
  }

  public static boolean isSameLength(short[] array1, short[] array2)
  {
    int length1 = array1 == null ? 0 : array1.length;
    int length2 = array2 == null ? 0 : array2.length;

    return length1 == length2;
  }

  public static boolean isSameLength(byte[] array1, byte[] array2)
  {
    int length1 = array1 == null ? 0 : array1.length;
    int length2 = array2 == null ? 0 : array2.length;

    return length1 == length2;
  }

  public static boolean isSameLength(double[] array1, double[] array2)
  {
    int length1 = array1 == null ? 0 : array1.length;
    int length2 = array2 == null ? 0 : array2.length;

    return length1 == length2;
  }

  public static boolean isSameLength(float[] array1, float[] array2)
  {
    int length1 = array1 == null ? 0 : array1.length;
    int length2 = array2 == null ? 0 : array2.length;

    return length1 == length2;
  }

  public static boolean isSameLength(boolean[] array1, boolean[] array2)
  {
    int length1 = array1 == null ? 0 : array1.length;
    int length2 = array2 == null ? 0 : array2.length;

    return length1 == length2;
  }

  public static boolean isSameLength(char[] array1, char[] array2)
  {
    int length1 = array1 == null ? 0 : array1.length;
    int length2 = array2 == null ? 0 : array2.length;

    return length1 == length2;
  }

  public static void reverse(Object[] array)
  {
    if (array == null) {
      return;
    }

    int i = 0; for (int j = array.length - 1; j > i; j--) {
      Object tmp = array[j];
      array[j] = array[i];
      array[i] = tmp;

      i++;
    }
  }

  public static void reverse(long[] array)
  {
    if (array == null) {
      return;
    }

    int i = 0; for (int j = array.length - 1; j > i; j--) {
      long tmp = array[j];
      array[j] = array[i];
      array[i] = tmp;

      i++;
    }
  }

  public static void reverse(int[] array)
  {
    if (array == null) {
      return;
    }

    int i = 0; for (int j = array.length - 1; j > i; j--) {
      int tmp = array[j];
      array[j] = array[i];
      array[i] = tmp;

      i++;
    }
  }

  public static void reverse(short[] array)
  {
    if (array == null) {
      return;
    }

    int i = 0; for (int j = array.length - 1; j > i; j--) {
      short tmp = array[j];
      array[j] = array[i];
      array[i] = tmp;

      i++;
    }
  }

  public static void reverse(byte[] array)
  {
    if (array == null) {
      return;
    }

    int i = 0; for (int j = array.length - 1; j > i; j--) {
      byte tmp = array[j];
      array[j] = array[i];
      array[i] = tmp;

      i++;
    }
  }

  public static void reverse(double[] array)
  {
    if (array == null) {
      return;
    }

    int i = 0; for (int j = array.length - 1; j > i; j--) {
      double tmp = array[j];
      array[j] = array[i];
      array[i] = tmp;

      i++;
    }
  }

  public static void reverse(float[] array)
  {
    if (array == null) {
      return;
    }

    int i = 0; for (int j = array.length - 1; j > i; j--) {
      float tmp = array[j];
      array[j] = array[i];
      array[i] = tmp;

      i++;
    }
  }

  public static void reverse(boolean[] array)
  {
    if (array == null) {
      return;
    }

    int i = 0; for (int j = array.length - 1; j > i; j--) {
      boolean tmp = array[j];
      array[j] = array[i];
      array[i] = tmp;

      i++;
    }
  }

  public static void reverse(char[] array)
  {
    if (array == null) {
      return;
    }

    int i = 0; for (int j = array.length - 1; j > i; j--) {
      char tmp = array[j];
      array[j] = array[i];
      array[i] = tmp;

      i++;
    }
  }

  public static int indexOf(Object[] array, Object objectToFind)
  {
    return indexOf(array, objectToFind, 0);
  }

  public static int indexOf(Object[] array, Object[] arrayToFind)
  {
    return indexOf(array, arrayToFind, 0);
  }

  public static int indexOf(Object[] array, Object objectToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0) {
      startIndex = 0;
    }

    if (objectToFind == null) {
      for (int i = startIndex; i < array.length; i++) {
        if (array[i] == null)
          return i;
      }
    }
    else {
      for (int i = startIndex; i < array.length; i++) {
        if (objectToFind.equals(array[i])) {
          return i;
        }
      }
    }

    return -1;
  }

  public static int lastIndexOf(Object[] array, Object objectToFind)
  {
    return lastIndexOf(array, objectToFind, 2147483647);
  }

  public static int lastIndexOf(Object[] array, Object[] arrayToFind)
  {
    return lastIndexOf(array, arrayToFind, 2147483647);
  }

  public static int lastIndexOf(Object[] array, Object objectToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0)
      return -1;
    if (startIndex >= array.length) {
      startIndex = array.length - 1;
    }

    if (objectToFind == null) {
      for (int i = startIndex; i >= 0; i--) {
        if (array[i] == null)
          return i;
      }
    }
    else {
      for (int i = startIndex; i >= 0; i--) {
        if (objectToFind.equals(array[i])) {
          return i;
        }
      }
    }

    return -1;
  }

  public static boolean contains(Object[] array, Object objectToFind)
  {
    return indexOf(array, objectToFind) != -1;
  }

  public static boolean contains(Object[] array, Object[] arrayToFind)
  {
    return indexOf(array, arrayToFind) != -1;
  }

  public static int indexOf(long[] array, long longToFind)
  {
    return indexOf(array, longToFind, 0);
  }

  public static int indexOf(long[] array, long longToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0) {
      startIndex = 0;
    }

    for (int i = startIndex; i < array.length; i++) {
      if (longToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }

  public static int lastIndexOf(long[] array, long longToFind)
  {
    return lastIndexOf(array, longToFind, 2147483647);
  }


  public static int lastIndexOf(long[] array, long longToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0)
      return -1;
    if (startIndex >= array.length) {
      startIndex = array.length - 1;
    }

    for (int i = startIndex; i >= 0; i--) {
      if (longToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }

  public static boolean contains(long[] array, long longToFind)
  {
    return indexOf(array, longToFind) != -1;
  }


  public static int indexOf(int[] array, int intToFind)
  {
    return indexOf(array, intToFind, 0);
  }


  public static int indexOf(int[] array, int intToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0) {
      startIndex = 0;
    }

    for (int i = startIndex; i < array.length; i++) {
      if (intToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }

  public static int lastIndexOf(int[] array, int intToFind)
  {
    return lastIndexOf(array, intToFind, 2147483647);
  }


  public static int lastIndexOf(int[] array, int intToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0)
      return -1;
    if (startIndex >= array.length) {
      startIndex = array.length - 1;
    }

    for (int i = startIndex; i >= 0; i--) {
      if (intToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }


  public static boolean contains(int[] array, int intToFind)
  {
    return indexOf(array, intToFind) != -1;
  }


  public static int indexOf(short[] array, short shortToFind)
  {
    return indexOf(array, shortToFind, 0);
  }


  public static int indexOf(short[] array, short shortToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0) {
      startIndex = 0;
    }

    for (int i = startIndex; i < array.length; i++) {
      if (shortToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }


  public static int lastIndexOf(short[] array, short shortToFind)
  {
    return lastIndexOf(array, shortToFind, 2147483647);
  }

  public static int lastIndexOf(short[] array, short shortToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0)
      return -1;
    if (startIndex >= array.length) {
      startIndex = array.length - 1;
    }

    for (int i = startIndex; i >= 0; i--) {
      if (shortToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }

  public static boolean contains(short[] array, short shortToFind)
  {
    return indexOf(array, shortToFind) != -1;
  }


  public static int indexOf(byte[] array, byte byteToFind)
  {
    return indexOf(array, byteToFind, 0);
  }

  public static int indexOf(byte[] array, byte byteToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0) {
      startIndex = 0;
    }

    for (int i = startIndex; i < array.length; i++) {
      if (byteToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }

  public static int lastIndexOf(byte[] array, byte byteToFind)
  {
    return lastIndexOf(array, byteToFind, 2147483647);
  }

  public static int lastIndexOf(byte[] array, byte byteToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0)
      return -1;
    if (startIndex >= array.length) {
      startIndex = array.length - 1;
    }

    for (int i = startIndex; i >= 0; i--) {
      if (byteToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }

  public static boolean contains(byte[] array, byte byteToFind)
  {
    return indexOf(array, byteToFind) != -1;
  }

  public static int indexOf(double[] array, double doubleToFind)
  {
    return indexOf(array, doubleToFind, 0, 0.0D);
  }

  public static int indexOf(double[] array, double doubleToFind, double tolerance)
  {
    return indexOf(array, doubleToFind, 0, tolerance);
  }

  public static int indexOf(double[] array, double doubleToFind, int startIndex)
  {
    return indexOf(array, doubleToFind, startIndex, 0.0D);
  }

  public static int indexOf(double[] array, double doubleToFind, int startIndex, double tolerance)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0) {
      startIndex = 0;
    }

    double min = doubleToFind - tolerance;
    double max = doubleToFind + tolerance;

    for (int i = startIndex; i < array.length; i++) {
      if ((array[i] >= min) && (array[i] <= max)) {
        return i;
      }
    }

    return -1;
  }

  public static int lastIndexOf(double[] array, double doubleToFind)
  {
    return lastIndexOf(array, doubleToFind, 2147483647, 0.0D);
  }

  public static int lastIndexOf(double[] array, double doubleToFind, double tolerance)
  {
    return lastIndexOf(array, doubleToFind, 2147483647, tolerance);
  }

  public static int lastIndexOf(double[] array, double doubleToFind, int startIndex)
  {
    return lastIndexOf(array, doubleToFind, startIndex, 0.0D);
  }

  public static int lastIndexOf(double[] array, double doubleToFind, int startIndex, double tolerance)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0)
      return -1;
    if (startIndex >= array.length) {
      startIndex = array.length - 1;
    }

    double min = doubleToFind - tolerance;
    double max = doubleToFind + tolerance;

    for (int i = startIndex; i >= 0; i--) {
      if ((array[i] >= min) && (array[i] <= max)) {
        return i;
      }
    }

    return -1;
  }


  public static boolean contains(double[] array, double doubleToFind)
  {
    return indexOf(array, doubleToFind) != -1;
  }

  public static boolean contains(double[] array, double doubleToFind, double tolerance)
  {
    return indexOf(array, doubleToFind, tolerance) != -1;
  }

  public static int indexOf(float[] array, float floatToFind)
  {
    return indexOf(array, floatToFind, 0, 0.0F);
  }

  public static int indexOf(float[] array, float floatToFind, float tolerance)
  {
    return indexOf(array, floatToFind, 0, tolerance);
  }

  public static int indexOf(float[] array, float floatToFind, int startIndex)
  {
    return indexOf(array, floatToFind, startIndex, 0.0F);
  }

  public static int indexOf(float[] array, float floatToFind, int startIndex, float tolerance)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0) {
      startIndex = 0;
    }

    float min = floatToFind - tolerance;
    float max = floatToFind + tolerance;

    for (int i = startIndex; i < array.length; i++) {
      if ((array[i] >= min) && (array[i] <= max)) {
        return i;
      }
    }

    return -1;
  }

  public static int lastIndexOf(float[] array, float floatToFind)
  {
    return lastIndexOf(array, floatToFind, 2147483647, 0.0F);
  }

  public static int lastIndexOf(float[] array, float floatToFind, float tolerance)
  {
    return lastIndexOf(array, floatToFind, 2147483647, tolerance);
  }

  public static int lastIndexOf(float[] array, float floatToFind, int startIndex)
  {
    return lastIndexOf(array, floatToFind, startIndex, 0.0F);
  }

  public static int lastIndexOf(float[] array, float floatToFind, int startIndex, float tolerance)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0)
      return -1;
    if (startIndex >= array.length) {
      startIndex = array.length - 1;
    }

    float min = floatToFind - tolerance;
    float max = floatToFind + tolerance;

    for (int i = startIndex; i >= 0; i--) {
      if ((array[i] >= min) && (array[i] <= max)) {
        return i;
      }
    }

    return -1;
  }

  public static boolean contains(float[] array, float floatToFind)
  {
    return indexOf(array, floatToFind) != -1;
  }

  public static boolean contains(float[] array, float floatToFind, float tolerance)
  {
    return indexOf(array, floatToFind, tolerance) != -1;
  }

  public static int indexOf(boolean[] array, boolean booleanToFind)
  {
    return indexOf(array, booleanToFind, 0);
  }

  public static int indexOf(boolean[] array, boolean booleanToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0) {
      startIndex = 0;
    }

    for (int i = startIndex; i < array.length; i++) {
      if (booleanToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }

  public static int lastIndexOf(boolean[] array, boolean booleanToFind)
  {
    return lastIndexOf(array, booleanToFind, 2147483647);
  }

  public static int lastIndexOf(boolean[] array, boolean booleanToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0)
      return -1;
    if (startIndex >= array.length) {
      startIndex = array.length - 1;
    }

    for (int i = startIndex; i >= 0; i--) {
      if (booleanToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }

  public static boolean contains(boolean[] array, boolean booleanToFind)
  {
    return indexOf(array, booleanToFind) != -1;
  }

  public static int indexOf(char[] array, char charToFind)
  {
    return indexOf(array, charToFind, 0);
  }

  public static int indexOf(char[] array, char charToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0) {
      startIndex = 0;
    }

    for (int i = startIndex; i < array.length; i++) {
      if (charToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }

  public static int lastIndexOf(char[] array, char charToFind)
  {
    return lastIndexOf(array, charToFind, 2147483647);
  }

  public static int lastIndexOf(char[] array, char charToFind, int startIndex)
  {
    if (array == null) {
      return -1;
    }

    if (startIndex < 0)
      return -1;
    if (startIndex >= array.length) {
      startIndex = array.length - 1;
    }

    for (int i = startIndex; i >= 0; i--) {
      if (charToFind == array[i]) {
        return i;
      }
    }

    return -1;
  }

  public static boolean contains(char[] array, char charToFind)
  {
    return indexOf(array, charToFind) != -1;
  }
  
}