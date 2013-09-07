package com.fafu.marlight_android.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public class Util
{
  public static final String HOST = "host";
  private static String NAME = "ptcapp";
  public static final String PORT = "port";

  public static int DipToPixels(Context paramContext, int paramInt)
  {
    return (int)(0.5F + paramContext.getResources().getDisplayMetrics().density * paramInt);
  }

  public static int convertPxOrDip(float paramFloat, int paramInt)
  {
    float f = paramInt / paramFloat;
    if (paramInt >= 0);
    for (int i = 1; ; i = -1)
      return (int)(f + 0.5F * i);
  }

  public static Bitmap drawableToBitmap(Drawable paramDrawable)
  {
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if (paramDrawable.getOpacity() != -1);
    for (Bitmap.Config localConfig = Bitmap.Config.ARGB_8888; ; localConfig = Bitmap.Config.RGB_565)
    {
      Bitmap localBitmap = Bitmap.createBitmap(i, j, localConfig);
      Canvas localCanvas = new Canvas(localBitmap);
      paramDrawable.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
      paramDrawable.draw(localCanvas);
      return localBitmap;
    }
  }

  public static Bitmap getDisableBitmap(Bitmap paramBitmap)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    int i = 0;
    if (i >= paramBitmap.getHeight())
      return localBitmap;
    for (int j = 0; ; j++)
    {
      if (j >= paramBitmap.getWidth())
      {
        i++;
        break;
      }
      localBitmap.setPixel(j, i, getDisaledColor(paramBitmap.getPixel(j, i)));
    }
    return localBitmap;
  }

  public static Drawable getDisableDrawable(Drawable paramDrawable)
  {
    return new BitmapDrawable(getDisableBitmap(((BitmapDrawable)paramDrawable).getBitmap()));
  }

  public static int getDisaledColor(int paramInt)
  {
    int i = Color.red(paramInt);
    int j = Color.blue(paramInt);
    int k = Color.green(paramInt);
    int m = Color.alpha(paramInt);
    int n = (int)(0.5F * i);
    int i1 = (int)(0.5F * j);
    return Color.argb(m, n, (int)(0.5F * k), i1);
  }

  public static Object getValue(Context paramContext, String paramString)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(NAME, 32768);
    if (paramString.equals("host"))
      return localSharedPreferences.getString(paramString, "192.168.1.100");
    if (paramString.equals("port"))
      return Integer.valueOf(localSharedPreferences.getInt(paramString, 50000));
    return null;
  }

  // ERROR //
  public static void saveDisableBitmap(Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokestatic 179	android/graphics/BitmapFactory:decodeResource	(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    //   5: invokestatic 116	com/fafu/marlight_android/util/Util:getDisableBitmap	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   8: astore_2
    //   9: new 181	java/io/File
    //   12: dup
    //   13: new 183	java/lang/StringBuilder
    //   16: dup
    //   17: invokestatic 189	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   20: invokevirtual 193	java/io/File:getPath	()Ljava/lang/String;
    //   23: invokestatic 196	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   26: invokespecial 199	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: ldc 201
    //   31: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: invokespecial 209	java/io/File:<init>	(Ljava/lang/String;)V
    //   40: astore_3
    //   41: aload_3
    //   42: invokevirtual 212	java/io/File:getParentFile	()Ljava/io/File;
    //   45: invokevirtual 216	java/io/File:exists	()Z
    //   48: ifne +11 -> 59
    //   51: aload_3
    //   52: invokevirtual 212	java/io/File:getParentFile	()Ljava/io/File;
    //   55: invokevirtual 219	java/io/File:mkdirs	()Z
    //   58: pop
    //   59: aconst_null
    //   60: astore 4
    //   62: new 221	java/io/FileOutputStream
    //   65: dup
    //   66: aload_3
    //   67: invokespecial 224	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   70: astore 5
    //   72: aload_2
    //   73: getstatic 230	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   76: bipush 100
    //   78: aload 5
    //   80: invokevirtual 234	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   83: pop
    //   84: aload 5
    //   86: invokevirtual 237	java/io/FileOutputStream:flush	()V
    //   89: aload 5
    //   91: invokevirtual 240	java/io/FileOutputStream:close	()V
    //   94: return
    //   95: astore 6
    //   97: aload 6
    //   99: invokevirtual 243	java/lang/Exception:printStackTrace	()V
    //   102: aload 4
    //   104: invokevirtual 240	java/io/FileOutputStream:close	()V
    //   107: return
    //   108: astore 9
    //   110: aload 9
    //   112: invokevirtual 244	java/io/IOException:printStackTrace	()V
    //   115: return
    //   116: astore 7
    //   118: aload 4
    //   120: invokevirtual 240	java/io/FileOutputStream:close	()V
    //   123: aload 7
    //   125: athrow
    //   126: astore 8
    //   128: aload 8
    //   130: invokevirtual 244	java/io/IOException:printStackTrace	()V
    //   133: goto -10 -> 123
    //   136: astore 11
    //   138: aload 11
    //   140: invokevirtual 244	java/io/IOException:printStackTrace	()V
    //   143: return
    //   144: astore 7
    //   146: aload 5
    //   148: astore 4
    //   150: goto -32 -> 118
    //   153: astore 6
    //   155: aload 5
    //   157: astore 4
    //   159: goto -62 -> 97
    //
    // Exception table:
    //   from	to	target	type
    //   62	72	95	java/lang/Exception
    //   102	107	108	java/io/IOException
    //   62	72	116	finally
    //   97	102	116	finally
    //   118	123	126	java/io/IOException
    //   89	94	136	java/io/IOException
    //   72	89	144	finally
    //   72	89	153	java/lang/Exception
  }

  public static void saveValue(Context paramContext, String paramString, Object paramObject)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(NAME, 32768).edit();
    if (paramString.equals("host"))
      localEditor.putString(paramString, (String)paramObject);
    while (true)
    {
      localEditor.commit();
      return;
    }
  }

  public Bitmap drawableToBitmap(Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    if (paramDrawable.getOpacity() != -1);
    for (Bitmap.Config localConfig = Bitmap.Config.ARGB_8888; ; localConfig = Bitmap.Config.RGB_565)
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, localConfig);
      Canvas localCanvas = new Canvas(localBitmap);
      paramDrawable.setBounds(0, 0, paramInt1, paramInt2);
      paramDrawable.draw(localCanvas);
      return localBitmap;
    }
  }
}

/* Location:           D:\DiskF_bak\lujianfei\J-�?��部\S-苏达武部门经理\D-待破解\Crack\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.fafu.marlight_android.util.Util
 * JD-Core Version:    0.6.2
 */