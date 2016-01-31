package cc.zhiyongwu.chapter2.util;

/**
 * Created by wuzhiyong on 16/1/31.
 */


import java.util.Objects;

/**
 * 类型转换工具类
 */
public final class CastUtil {
    /**
     * 转为String型
     * @param obj
     * @return
     */
    public static String castString(Object obj){
        return CastUtil.castString(obj,"");
    }

    /**
     * 转为String型(提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj,String defaultValue){
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为double型
     * @param obj
     * @return
     */
    public static Double castDouble(Object obj){
        return CastUtil.castDouble(obj,0);
    }

    /**
     * 转为double型(提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static Double castDouble(Object obj,double defaultValue){
        double value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Double.parseDouble(strValue);
                }catch (NumberFormatException e){
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    /**
     * 转为long型
     * @param obj
     * @return
     */
    public static Long castLong(Object obj){
        return CastUtil.castLong(obj,0);
    }

    /**
     * 转为long型(提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static Long castLong(Object obj,long defaultValue){
        long value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Long.parseLong(strValue);
                }catch (NumberFormatException e){
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    /**
     * 转为int型
     * @param obj
     * @return
     */
    public static int castInt(Object obj){
        return CastUtil.castInt(obj,0);
    }

    /**
     * 转为int型(提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static int castInt(Object obj,int defaultValue){
        int value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            try {
                value = Integer.parseInt(strValue);
            }catch (NumberFormatException e){
                value = defaultValue;
            }
        }
        return value;
    }

    /**
     * 转为bool 型
     * @param obj
     * @return
     */
    public static boolean castBoolean(Object obj){
        return CastUtil.castBoolean(obj,false);
    }

    /**
     * 转为bool型(提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object obj ,boolean defaultValue){
        boolean value = defaultValue;
        if(obj != null){
            value = Boolean.parseBoolean(castString(obj));
        }
        return value;
    }
}
