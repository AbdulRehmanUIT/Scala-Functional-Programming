import chisel3._
import chisel3.util._
import chisel3.experimental.{BaseModule}
// Define IOinterface as a Trait
trait ModuleIO{
  def in1:UInt
  def in2:UInt
  def out:UInt
}
class Add extends RawModule with ModuleIO{
  val in1= IO(Input (UInt (8.W)))
  val in2 = IO (Input (UInt (8.W)))
  val out=IO(Output (UInt (8.W)))
  out := in1 + in2
}
class Sub extends RawModule with ModuleIO{
  val in1 = IO(Input (UInt (8.W)))
  val in2 = IO (Input (UInt (8.W)))
  val out = IO(Output (UInt (8.W)))
  out := in1 - in2

}


class Top[T1 <: RawModule, T2 <: RawModule](genT1: => T1, genT2: => T2) extends Module {
  val io= IO(new Bundle {
    val in1 =  Input (UInt (8.W))
    val in2=Input (UInt (8.W))
    val outsub=Output (UInt (8.W))
    val outadd=Output (UInt (8.W))
  })
  val sub_Module = Module(genT1)
  io.outsub := sub_Module.out
  sub_Module.in1 := io.in1
  sub_Module. in2 := io. in2


  val add_Module = Module(genT2)
  io.outadd := add_Module.out
  add_Module.in1 := io.in1
  add_Module.in2 := io.in2

}
