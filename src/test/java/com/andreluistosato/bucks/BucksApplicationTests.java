package com.andreluistosato.bucks;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BucksApplicationTests {

  @Test
  void contextLoads() {}

  @Test
  void successfulTest() {
    assertThat(1 + 1, Matchers.is(2));
  }

  @Test
  void invalidTest() {
    assertThat(1 + 1, Matchers.is(3));
  }
}
