package net.ipetty.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 性别
 *
 * @author luocanfeng
 * @date 2014年5月7日
 */
public class PetFamilyVO {

    public static final String DOG = "汪星人";
    public static final String CAT = "喵星人";
    public static final String OTHERS = "异星人";

    private static final List<String> ALL = new ArrayList<String>(3);

    static {
        ALL.add(DOG);
        ALL.add(CAT);
        ALL.add(OTHERS);
    }

    /**
     * 获取性别列表（供选择）
     */
    public static final List<String> list() {
        return ALL;
    }

}
