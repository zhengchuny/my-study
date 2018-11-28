package com.study.luxin

class Test {

    def "fsdfsd"() {


        String owner = context.userId
        String dt1 = context.data.UDDate1__c//放款日期
        String dt2 = context.data.UDDate2__c//支付日期
        String kh = context.data.account_id//客户名称
        String dd = context.data._id//订单编号

        String fkrqy = dt1.substring(0, 4)//放款年
        String fkrqm = dt1.substring(5, 7)//放款月
        String fkrqd = dt1.substring(8, 10)//放款日

        String zfrqy = dt2.substring(0, 4)//支付年
        String zfrqm = dt2.substring(5, 7)//支付月
        String zfrqd = dt2.substring(8, 10)//支付日

        BigDecimal ddje = context.data.order_amount as BigDecimal//订单金额
        int fq = context.data.UDDec3__c as int//贷款期数
        BigDecimal hkje = ddje / fq as BigDecimal//每期应还


        Date fkrq = "2012-01-01"
        Date zfrq = "2012-01-01"

        Formatter.DateTime sktx = "2018-09-10 09:00"
        Formatter.DateTime fktx = "2018-09-10 09:00"

        int fkrqy1 = fkrqy as int
        int fkrqm1 = fkrqm as int
        int fkrqd1 = fkrqd as int

        int zfrqy1 = zfrqy as int
        int zfrqm1 = zfrqm as int
        int zfrqd1 = zfrqd as int

        fkrq = fkrq.withYear(fkrqy1)
        fkrq = fkrq.withMonth(fkrqm1)
        fkrq = fkrq.withDay(fkrqd1)//


        zfrq = zfrq.withYear(zfrqy1)
        zfrq = zfrq.withMonth(zfrqm1)
        zfrq = zfrq.withDay(zfrqd1)//

        sktx = sktx.withYear(fkrqy1)
        sktx = sktx.withMonth(fkrqm1)
        sktx = sktx.withDay(fkrqd1)//

        fktx = fktx.withYear(zfrqy1)
        fktx = fktx.withMonth(zfrqm1)
        fktx = fktx.withDay(zfrqd1)//

        int a = 0



        def (error1, data1, errorMessage1) = Fx.object.findById("AccountObj", kh)
        if (error1) {
            log.info("无记录")
            return;
        }
        Map AccountObjmap = data1 as Map
        String id1 = data1["name"] as String


        String aaa = "#"
        String bbb = aaa.concat(id1)
        String ccc = bbb.concat(aaa)//客户名称话题

        log.info(ccc)

        String ddd = context.data.name
        String eee = aaa.concat(ddd)
        String fff = eee.concat(aaa)//订单话题

        log.info(fff)


        List name1 = [

                ["UDDec1__c": Operator.NE(0)]

        ]

//以下步骤为查找未更新的物资
        def (error, data, errorMessage) = Fx.object.find("ProductObj", name1, fq, 0)

        if (a <= fq) {


            List datalist = data["dataList"] as List
            datalist.eachWithIndex { item, int i ->

                a = a + 1

                fkrq = fkrq + 1.months//回款日期
                zfrq = zfrq + 1.months//支付日期
                fktx = fktx + 1.months//付款提醒
                sktx = sktx + 1.months//收款提醒


                Map b = [
                        'account_id'         : kh,//客户名称
                        'order_id'           : dd,//订单编号
                        'plan_payment_amount': hkje,//计划回款金额
                        'plan_payment_time'  : fkrq,//计划回款日期
                        'field_xf271__c'     : fktx,//付款提醒
                        'field_HjC46__c'     : sktx,//收款提醒
                        'owner'              : [owner]//
                ]

                //log.info(dt)
                def (error2, data2, errorMessage2) = Fx.object.create("PaymentPlanObj", b)
                if (error2) {
                    log.info(errorMessage2)
                    return;
                }

//log.info(a1)
                String a1 = a

                String nr = ccc + "的" + fff + "订单，第" + a1 + "期收款提醒时间已到，请及时收款，避免造成不必要的损失。"

                log.info(nr)

                Formatter.DateTime beginTime = sktx - 2.days

                Formatter.DateTime endTime = beginTime + 1.hours
                log.info(beginTime)

//Boolean isFullDate = false;
//Boolean isNeedReceipt= false;

                Fx.work.createSchedule(nr, beginTime, endTime, true, true, [RemindTime.BEGIN()], [users: [owner]])

//log.info(fkrq)
//log.info(zfrq)
//log.info(a)

//循环
            }

        }

    }


}
