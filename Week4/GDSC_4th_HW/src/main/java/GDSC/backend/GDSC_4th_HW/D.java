package GDSC.backend.GDSC_4th_HW;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class D {
    private C c;

    public C getC() {
        return c;
    }
}
