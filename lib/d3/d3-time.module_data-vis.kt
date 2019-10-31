@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface TimeInterval {
    @nativeInvoke
    operator fun invoke(date: Date): Date
    fun floor(date: Date): Date
    fun round(date: Date): Date
    fun ceil(date: Date): Date
    fun offset(date: Date, step: Number? = definedExternally /* null */): Date
    fun range(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>
    fun filter(test: (date: Date) -> Boolean): TimeInterval
}

external interface CountableTimeInterval : TimeInterval {
    fun count(start: Date, end: Date): Number
    fun every(step: Number): TimeInterval?
}

external fun timeInterval(floor: (date: Date) -> Unit, offset: (date: Date, step: Number) -> Unit): TimeInterval

external fun timeInterval(floor: (date: Date) -> Unit, offset: (date: Date, step: Number) -> Unit, count: (start: Date, end: Date) -> Number, field: ((date: Date) -> Number)? = definedExternally /* null */): CountableTimeInterval

external var timeMillisecond: CountableTimeInterval

external fun timeMilliseconds(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeSecond: CountableTimeInterval

external fun timeSeconds(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeMinute: CountableTimeInterval

external fun timeMinutes(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeHour: CountableTimeInterval

external fun timeHours(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeDay: CountableTimeInterval

external fun timeDays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeWeek: CountableTimeInterval

external fun timeWeeks(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeSunday: CountableTimeInterval

external fun timeSundays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeMonday: CountableTimeInterval

external fun timeMondays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeTuesday: CountableTimeInterval

external fun timeTuesdays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeWednesday: CountableTimeInterval

external fun timeWednesdays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeThursday: CountableTimeInterval

external fun timeThursdays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeFriday: CountableTimeInterval

external fun timeFridays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeSaturday: CountableTimeInterval

external fun timeSaturdays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeMonth: CountableTimeInterval

external fun timeMonths(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var timeYear: CountableTimeInterval

external fun timeYears(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcMillisecond: CountableTimeInterval

external fun utcMilliseconds(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcSecond: CountableTimeInterval

external fun utcSeconds(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcMinute: CountableTimeInterval

external fun utcMinutes(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcHour: CountableTimeInterval

external fun utcHours(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcDay: CountableTimeInterval

external fun utcDays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcWeek: CountableTimeInterval

external fun utcWeeks(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcSunday: CountableTimeInterval

external fun utcSundays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcMonday: CountableTimeInterval

external fun utcMondays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcTuesday: CountableTimeInterval

external fun utcTuesdays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcWednesday: CountableTimeInterval

external fun utcWednesdays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcThursday: CountableTimeInterval

external fun utcThursdays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcFriday: CountableTimeInterval

external fun utcFridays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcSaturday: CountableTimeInterval

external fun utcSaturdays(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcMonth: CountableTimeInterval

external fun utcMonths(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>

external var utcYear: CountableTimeInterval

external fun utcYears(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>