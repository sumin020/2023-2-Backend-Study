package GDSC.backend.GDSC_3rd_HW;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class ClassC {
    private ClassA classA;

    public ClassC(ClassA classA) {
        this.classA = classA;
    }
}
