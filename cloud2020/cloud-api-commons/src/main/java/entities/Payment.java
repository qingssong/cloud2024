package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @auther zzyy
 * @create 2020-01-27 20:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Alias("Payment")
public class Payment implements Serializable
{
    private Long id;
    private String serial;
}
