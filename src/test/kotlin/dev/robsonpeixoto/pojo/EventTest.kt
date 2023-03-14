package dev.robsonpeixoto.pojo

import kotlin.test.Test
import org.apache.flink.types.PojoTestUtils.assertSerializedAsPojoWithoutKryo

internal class EventTest {
  @Test
  fun isPojo() {
    assertSerializedAsPojoWithoutKryo(GithubEvent::class.java)
  }
}
