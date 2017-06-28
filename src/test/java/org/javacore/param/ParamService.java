package org.javacore.param;

/**
 * Created by bysocket on 16/7/18.
 */
public class ParamService {
	
	@SuppressWarnings("all")
    public void test01(Param param) {
        Integer id  = param.getId();
        String sex  = param.getSex();
        String name = param.getName();
        Integer age = param.getAge();
        Integer isBeautiful = param.getIsBeautiful();
    }

	public void test02(int i, String string, String string2, int j, int k) {
		// TODO test02
	}
}
