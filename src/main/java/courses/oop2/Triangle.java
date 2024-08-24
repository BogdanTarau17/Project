package courses.oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Triangle extends Shape{

    @Setter
    private int l1;

    @Setter
    private int l2;

    @Setter
    private int l3;

}
