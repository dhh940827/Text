package com.sj33333.yimentong.testpay

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import com.alipay.sdk.app.PayTask

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        mAPIService.getInfo()
//                .map {
//                    val alipay = PayTask(this@MainActivity)
//                    val result = alipay.payV2(it.payment_param, true)
//                    Log.i("msp", result.toString())
//                    val msg = Message().apply {
//                        this.what = SDK_PAY_FLAG
//                        this.obj = result
//                    }
//                    msg
//                }
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe{
//                    val payResult = PayResult(it.obj as Map<String, String>)
//                    /**
//                    对于支付结果，请商户依赖服务端的异步通知结果。同步通知结果，仅作为支付结束的通知。
//                     */
//                    val resultInfo = payResult.result// 同步返回需要验证的信息
//                    val resultStatus = payResult.resultStatus
//                    // 判断resultStatus 为9000则代表支付成功
//                    if (TextUtils.equals(resultStatus, "9000")) {
//                        // 该笔订单是否真实支付成功，需要依赖服务端的异步通知。
//                        Toast.makeText(this@MainActivity, "支付成功", Toast.LENGTH_SHORT).show()
//                    } else {
//                        // 该笔订单真实的支付结果，需要依赖服务端的异步通知。
//                        Toast.makeText(this@MainActivity, "支付失败", Toast.LENGTH_SHORT).show()
//                    }
//                }
    }
}
