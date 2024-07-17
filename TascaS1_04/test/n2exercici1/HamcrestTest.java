package n2exercici1;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HamcrestTest {
	
	
	public static Matcher<String> stringLength(Matcher<? super Integer> matcher) {
    return new FeatureMatcher<String, Integer>(matcher,
            "a String of length that", "length") {
        @Override
        protected Integer featureValueOf(String word) {
    		return word.length();
    	}
    };
	}
	
		@Test
		@DisplayName("Checking if a String has the expected length.")
		public void stringMatchesLength() {
			assertThat("Mordor", stringLength(is(8)));
			
		}

}
