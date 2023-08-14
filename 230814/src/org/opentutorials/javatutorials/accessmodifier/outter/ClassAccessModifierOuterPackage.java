package org.opentutorials.javatutorials.accessmodifier.outter;
import org.opentutorials.javatutorials.accessmodifier.inner.*;
public class ClassAccessModifierOuterPackage {
    PublicClass publicClass = new PublicClass();
    //DefaultClass defaultClass = new DefaultClass();
    //DefaultClass 접근제어자가 없다는것은 default이고 , 같은 클래스에서만 사용할 수 있기 때문에 outter패키지에서 사용불가능.
}