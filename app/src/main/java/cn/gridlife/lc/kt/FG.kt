package cn.gridlife.lc.kt

/**
 * @author XiaoBei
 * @package cn.gridlife.lc.kt.FG
 * @FileName FG
 * @date 2020/6/23 14:22
 * @description TODO
 *
 */
//给你两个二进制字符串，返回它们的和（用二进制表示）。
//
//输入为 非空 字符串且只包含数字 1 和 0。
//
//示例 1:
//
//输入: a = "11", b = "1"
//输出: "100"

//示例 2:
//输入: a = "1010", b = "1011"
//输出: "10101"
// 
//提示：
//每个字符串仅由字符 '0' 或 '1' 组成。
//1 <= a.length, b.length <= 10^4
//字符串如果不是 "0" ，就都不含前导零。

class FG {
    /**
     * 坑： 二位数组 先倒序 再进行处理，不然 数组索引全是坑。
     */
    fun addBinary(a: String, b: String): String {
        //a长度
        var la = a.length
        var lb = b.length
        var t = 0;
        var ta: Int
        var tb: Int
        var result: IntArray;
        if (la > lb) {
            result = IntArray(la + 1) { 0 }
            for (i in la downTo 0) {
                tb = if (la - i < lb) {
                    b[la - i -1].toString().toInt()
                } else {
                    0
                }
                ta = a[i].toString().toInt()
                t += ta + tb
                result[i+1] = t.rem(2)
                t = t.div(2)
            }
            return if (t == 1) {
                result[0] = 1
                result.joinToString("","","",la+1,"") {i->i.toString() }
            } else {
                result.joinToString("","","",la+1,"") {i->i.toString() }.substring(1)
            }
        } else {
            result = IntArray(lb + 1) { 0 }
            for (i in lb-1 downTo   0) {
                ta = if (lb-i < la) {

                    a[lb-i-1].toString().toInt()

                } else {
                    0
                }
                tb = b[i].toString().toInt()
                t += ta + tb
                result[i+1] = t.rem(2)
                t = t.div(2)
            }
            return if (t == 1) {
                result[0] = 1
                result.joinToString("","","",lb+1,"") {i->i.toString() }
            } else {
                result.joinToString("","","",lb+1,"") {i->i.toString() }.substring(1)
            }
        }

    }
}