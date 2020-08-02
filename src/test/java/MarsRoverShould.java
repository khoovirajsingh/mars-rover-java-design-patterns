import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MarsRoverShould {

    private MarsRover marsRover;

    @BeforeEach
    void setUp() {
        marsRover = marsRover();
    }

    @ParameterizedTest
    @CsvSource({
        "R,0:0:E",
        "RR,0:0:S",
        "RRR,0:0:W",
        "RRRR, 0:0:N"
    })
    void rotate_right(String commands, String position) {
        assertThat(marsRover.execute(commands), is(position));
    }

    @ParameterizedTest
    @CsvSource({
            "L,0:0:W",
            "LL,0:0:S",
            "LLL,0:0:E",
            "LLLL, 0:0:N"
    })
    void rotate_left(String commands, String position) {
        assertThat(marsRover.execute(commands), is(position));
    }

    @ParameterizedTest
    @CsvSource({
            "M,0:1:N",
            "MMM,0:3:N"
    })
    void move_up(String commands, String position) {
        assertThat(marsRover.execute(commands), is(position));
    }

    @ParameterizedTest
    @CsvSource({
            "MMMMMMMMMM,0:0:N"
    })
    void wrap_up_moving_north(String commands, String position) {
        assertThat(marsRover.execute(commands), is(position));
    }

    @Test
    void foo() {
        assertThat(new Coordinate(1,1), is(new Coordinate(1, 1)));
    }

    private MarsRover marsRover() {
        return new MarsRover(null);
    }
}
