package cn.gridlife.lc.kt

/**
 * @author XiaoBei
 * @package cn.gridlife.lc.kt.MainKT
 * @FileName MainKT
 * @date 2020/6/23 14:21
 * @description TODO
 *
 */
object MainKT {
    @JvmStatic
    fun main(args: Array<String>) {
//        var fg = FG();
//        print(0.toString())
//        print(fg.addBinary("10", "11"))
        var bzi =BZI()
        var nums:IntArray= intArrayOf(1,2,3,4,5)
        print(bzi.minSubArrayLen(7,nums))
    }
}