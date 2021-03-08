package common.springboot.biz;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@ToString
public class User implements Serializable {
    private String id;
    private String name; 
}
