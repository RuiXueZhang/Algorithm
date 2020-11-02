package Data;

import java.io.*;

public class Steps {
/**
    Feature: 量子apply接口测试

    Scenario Outline: apply接口正常申请
    Given 根据配置文件配置参数
    Then  注册一个云游戏，并校验"<streamerType>"
    Then  等待流类型是"<streamType>"的播流事件，最多30秒
    Then  刷新云游戏stoken
    Then  等待流类型是"<streamerType>"的播流事件，最多30秒
    Then  断开云游戏Link链接
    Then  结束云玩
    Examples:
            | streamerType | streamType |
            | WEBRTC       | WEBRTC     |
 */
/*
package com.haima.cloud.platform.cloudplay;

import com.alibaba.fastjson.JSONObject;
import com.haima.cloudplayer.servicecore.domain.SignInfo;
import com.haima.cloudplayer.servicecore.domain.request.ApplyRequest;
import com.haima.cloudplayer.servicecore.domain.response.ApplyResponse;

import com.haima.cloudplayer.servicecore.facade.model.FacadeResponseBody;
import com.haima.cloudplayer.servicecore.facade.model.FacadeSignedArtifactRequestBody;

import com.haima.cloudplayer.servicecore.utils.PublicUtils;
import com.haima.cloudplayer.utils.LogHelper;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.mockserver.client.MockServerClient;

import java.io.*;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;


    public class MyStepdefs {

        private FacadeSignedArtifactRequestBody<ApplyRequest> applyRequestBody;

        private String apply;

        private String accessKey = "0db0724dcbcad2ec8f33b74ddfac81a0";

        @Given("^根据配置文件配置参数$")
        public void 根据配置文件配置参数() {

            System.out.println("根据配置文件配置参数");

            apply = null;
            try {
                apply = fileRead();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.applyRequestBody = JSONObject.parseObject(apply, FacadeSignedArtifactRequestBody.class);
            SignInfo sign = PublicUtils.generate(applyRequestBody.getRequest(), accessKey);
            applyRequestBody.setSign(sign.getSign());
            if(applyRequestBody != null){
                System.out.println("参数初始化成功");
            }

        }

        @Before
        public void setUp(){

            new MockServerClient("localhost",8070)
                    .when(
                            request()
                                    .withMethod("POST")
                                    .withPath("/apply/f6b5aec5e41/com.wepie.snake.game_demo/Android")
                    )
                    .respond(
                            response()
                                    .withStatusCode(200)
                    );

        }

        @Then("^注册一个云游戏，并校验\"([^\"]*)\"$")
        public void 注册一个云游戏_并校验(String streamType) throws Throwable {

            //DesiredCapabilities capabilities = new DesiredCapabilities();

            String url = "http://localhost:8070/apply/f6b5aec5e41/com.wepie.snake.game_demo/Android";
            //capabilities.setCapability("body", applyRequestBody);
            // capabilities.setCapability("Content-Type","application/json");

            CloseableHttpClient client = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Content-Type", "application/json");

            StringEntity entity = new StringEntity(apply, "utf-8");

            httpPost.setEntity(entity);
            CloseableHttpResponse response = client.execute(httpPost);


            InputStream inputStream = response.getEntity().getContent();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String responseText = bufferedReader.readLine();

            FacadeResponseBody<ApplyResponse> result = JSONObject.parseObject(responseText, FacadeResponseBody.class);
            if(!result.getResponse().getStreamingType().name().equals(streamType)){
                LogHelper.instance(MyStepdefs.class).
                        p("info","streamType not match").
                        e();
                throw new PendingException();
            }


            System.out.println("注册一个云游戏，并检验流类型");
        }

        @Then("^等待流类型是\"([^\"]*)\"的播流事件，最多(\\d+)秒$")
        public void 等待流类型是_的播流事件_最多_秒(String arg1, int arg2) {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("根据配置文件配置参数$");
        }

        @Then("^刷新云游戏stoken$")
        public void 刷新云游戏stoken()  {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("根据配置文件配置参数$");
        }

        @Then("^断开云游戏Link链接$")
        public void 断开云游戏link链接() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("根据配置文件配置参数$");
        }

        @Then("^结束云玩$")
        public void 结束云玩() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("根据配置文件配置参数$");
        }


        public static String fileRead() throws Exception {
            File file = new File("D:\\haima-saas\\haimacloud-service-core\\app\\src\\test\\resources\\applyRequest.json");//定义一个file对象，用来初始化FileReader
            FileReader reader = new FileReader(file);//定义一个fileReader对象，用来初始化BufferedReader
            BufferedReader bReader = new BufferedReader(reader);//new一个BufferedReader对象，将文件内容读取到缓存
            StringBuilder sb = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
            String s = "";
            while ((s =bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
                sb.append(s + "\n");//将读取的字符串添加换行符后累加存放在缓存中
            }
            bReader.close();
            String str = sb.toString();
            System.out.println(str );
            return str;
        }
    }*/




}
