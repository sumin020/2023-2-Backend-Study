package GDSC.backend.GDSC_4th_HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    private B b;

    @Autowired
    private C c;

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }
}
