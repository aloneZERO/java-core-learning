package org.javacore.base.String; 

/*
 * Copyright [2015] [Jeff Lee]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * 对象含有String作为方法参数传递
 * @author BYSocket, justZero
 * @since 2016-01-06
 */
public class StringT2 {
	
	static StringObject sb = new StringObject();
	
    public static void main(String[] args) {
        
        sb.setName("123");
        change(sb);
        System.out.println(sb.getName());
    }

    public static void change(StringObject so) {
    	System.out.println(so==sb);
        so = new StringObject();
        so.setName("456");
    }

}
class StringObject {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
