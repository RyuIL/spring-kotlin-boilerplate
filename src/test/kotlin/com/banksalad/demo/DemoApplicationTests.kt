package com.banksalad.demo

import com.banksalad.demo.stock.TestService
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
class DemoApplicationTests {

    private val testService: TestService = TestService()

    @Test
    fun getTest(){
        testService.getTest()
    }
}
