// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: struct.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package protobuf.kogan;

@kotlin.jvm.JvmName("-initializeproject")
public inline fun project(block: protobuf.kogan.ProjectKt.Dsl.() -> kotlin.Unit): protobuf.kogan.Struct.Project =
  protobuf.kogan.ProjectKt.Dsl._create(protobuf.kogan.Struct.Project.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `protobuf.kogan.Project`
 */
public object ProjectKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: protobuf.kogan.Struct.Project.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: protobuf.kogan.Struct.Project.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): protobuf.kogan.Struct.Project = _builder.build()

    /**
     * `string repo = 1;`
     */
    public var repo: kotlin.String
      @JvmName("getRepo")
      get() = _builder.getRepo()
      @JvmName("setRepo")
      set(value) {
        _builder.setRepo(value)
      }
    /**
     * `string repo = 1;`
     */
    public fun clearRepo() {
      _builder.clearRepo()
    }

    /**
     * `bytes mark = 2;`
     */
    public var mark: com.google.protobuf.ByteString
      @JvmName("getMark")
      get() = _builder.getMark()
      @JvmName("setMark")
      set(value) {
        _builder.setMark(value)
      }
    /**
     * `bytes mark = 2;`
     */
    public fun clearMark() {
      _builder.clearMark()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun protobuf.kogan.Struct.Project.copy(block: `protobuf.kogan`.ProjectKt.Dsl.() -> kotlin.Unit): protobuf.kogan.Struct.Project =
  `protobuf.kogan`.ProjectKt.Dsl._create(this.toBuilder()).apply { block() }._build()

