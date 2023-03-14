package dev.robsonpeixoto.pojo

import kotlin.test.Test
import org.apache.flink.types.PojoTestUtils.assertSerializedAsPojoWithoutKryo

internal class UserTest {
  @Test
  fun isPojo() {
    assertSerializedAsPojoWithoutKryo(User::class.java)
  }
}
