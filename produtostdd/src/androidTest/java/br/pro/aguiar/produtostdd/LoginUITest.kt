package br.pro.aguiar.produtostdd

import android.graphics.ColorSpace.match
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class LoginUITest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setupDashboard() {
        onView(withHint("e-mail"))
            .perform(typeText("thi@go.com"))
        onView(withHint("Senha"))
            .perform(typeText("123456"), closeSoftKeyboard())
        onView(withId(R.id.btnLoginAcessar))
            .perform(click())
        onView(withText("Dashboard"))
            .check(matches(isDisplayed()))
    }


    @Test
    fun verificarSeTituloLoginFoiExibido(){
        onView(withText("Login"))
            .check(matches(isDisplayed()))
        onView(withHint("e-mail"))
            .check(matches(isEnabled()))
        onView(withHint("Senha"))
            .check(matches(isEnabled()))
        onView(withId(R.id.btnLoginAcessar))
            .check(matches(isEnabled()))
    }

    @Test
    fun verificarSeNaoPermiteLogarComCamposEmBranco() {
        onView(withHint("e-mail"))
            .perform(clearText())
        onView(withHint("Senha"))
            .perform(clearText())
        onView(withId(R.id.btnLoginAcessar))
            .perform(click())
        onView(withText("Preencha todos os campos!"))
            .check(matches(isDisplayed()))
    }

    @Test
    fun verificarSeUsuarioValidoSeLoga() {
        // inserir um registro fake na base de teste
        onView(withHint("e-mail"))
            .perform(typeText("thi@go.com"))
        onView(withHint("Senha"))
            .perform(typeText("123456"), closeSoftKeyboard())
        onView(withId(R.id.btnLoginAcessar))
            .perform(click())
        onView(withText("Dashboard"))
            .check(matches(isDisplayed()))
    }

    @Test
    fun verificarSeUsuarioInvalidoNaoSeLoga() {
        // inserir um usuario thi@go.uk com uma senha ABC
        onView(withHint("e-mail"))
            .perform(typeText("thi@go.uk"))
        onView(withHint("Senha"))
            .perform(typeText("123"), closeSoftKeyboard())
        onView(withId(R.id.btnLoginAcessar))
            .perform(click())
        onView(withText("Usuário ou Senha inválido!"))
            .check(matches(isDisplayed()))
    }


}