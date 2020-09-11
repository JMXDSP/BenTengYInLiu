<template>
  <div style="height: 100%; overflow-y: scroll;" id="home" class="home">
    <el-backtop target=".home" :bottom="100">
    </el-backtop>
    <div>
      <el-row>
        <el-col :span="24">
          <div style="height: 500px;position: relative;z-index: 2">
          </div>
          <div class="home-banner">
            <div class="banner-war">
              <el-image style="height: 99%;width: 100%;" :src="url"></el-image>
            </div>
            <div class="banner-body">
              <div class="title">奔腾引流 让直播&amp;视频流量变现更简单</div>
              <br/>
              <div style="text-align: center;">
                <label v-for="(data,index) in bannerLable" style="padding: 0 15px;" :key="index">
                  <el-button v-if="index === currentIndex" size="mini"
                             style="background-color:#1e9fff;color: hsla(0,0%,100%,.8);border:0;" round>{{ data }}
                  </el-button>
                  <el-button @click="setIndex(index)" v-else size="mini"
                             style="background-color:transparent;color: hsla(0,0%,100%,.8);border:0;" round>{{ data }}
                  </el-button>
                </label>
              </div>
              <br/>
              <div class="banner-search">
                <el-row>
                  <el-col :span="21">
                    <div class="grid-content bg-purple">
                      <el-input class="home-input" v-model="input" :placeholder="currentList[currentIndex]" ref="searchText"></el-input>
                    </div>
                  </el-col>
                  <el-col :span="3">
                    <div class="grid-content bg-purple-light">
                      <el-button type="primary" @click="searchClick">搜索</el-button>
                    </div>
                  </el-col>
                </el-row>

              </div>
            </div>
          </div>
        </el-col>
        <el-col :span="24">
          <div class="content-war">
            <el-row :gutter="20" class="content-war-body" style="margin-left: 0;margin-right: 0;">
              <el-col :span="8" style="padding: 20px 10px">
                <el-card shadow="hover" style="border-radius: 10px">
                  <div slot="header" class="clearfix" style="padding: 10px;font-weight: 600;font-size: 16px;">
                    <span>
                      热门视频
                    </span>
                    <el-tooltip class="item" effect="dark" content="热门视频" placement="top">
                      <svg version="1.1" viewBox="0 0 14 14" class="el-tooltip ml5 cursor-pointer svg-icon svg-fill"
                           aria-describedby="el-tooltip-4353" tabindex="0"
                           style="width: 14px; height: 14px; margin: 0 auto;">
                        <g _fill="#000" fill-rule="nonzero">
                          <path fill="#0D0D0D" stroke="none" pid="0"
                                d="M6.965.01a6.96 6.96 0 100 13.921 6.96 6.96 0 000-13.92zm4.219 11.18a5.927 5.927 0 01-4.219 1.747 5.927 5.927 0 01-4.218-1.748A5.927 5.927 0 01.999 6.971c0-1.594.621-3.092 1.748-4.219a5.927 5.927 0 014.218-1.747c1.594 0 3.092.62 4.219 1.747a5.927 5.927 0 011.747 4.219c0 1.593-.62 3.092-1.747 4.218z"></path>
                          <path fill="#0D0D0D" stroke="none" pid="1"
                                d="M9.192 5.179c0 .215-.023.404-.069.563a1.634 1.634 0 01-.198.436 2.416 2.416 0 01-.321.392 8.376 8.376 0 01-.442.41c-.148.126-.27.239-.362.334a1.58 1.58 0 00-.24.313 1.132 1.132 0 00-.13.35 2.242 2.242 0 00-.037.431c0 .07-.056.127-.126.127h-.715a.127.127 0 01-.127-.127v-.13c0-.164.012-.311.036-.438a1.515 1.515 0 01.305-.68c.085-.108.194-.227.326-.352l.487-.464c.145-.13.272-.28.377-.442.114-.176.171-.39.171-.637 0-.32-.103-.593-.306-.814-.208-.225-.5-.338-.869-.338a1.226 1.226 0 00-.91.39c-.111.12-.197.26-.254.417v.003a.414.414 0 01-.426.273l-.176-.016a.413.413 0 01-.346-.566A2.094 2.094 0 016.157 3.38c.27-.091.567-.137.883-.137.292 0 .573.043.835.127.258.084.488.21.686.373.194.161.35.364.462.603.112.237.17.518.17.833zm-3.043 4.6c0-.202.074-.377.223-.523a.738.738 0 01.536-.218c.203 0 .38.07.532.21.152.138.229.31.229.512a.707.707 0 01-.224.522.74.74 0 01-.537.219.816.816 0 01-.531-.21.7.7 0 01-.228-.512z"></path>
                        </g>
                      </svg>
                    </el-tooltip>
                    <div style="float: right; padding: 3px 0">
                      <!--          <a href="" class="" style="font-size: 14px;color: #f87653;">··· 更多</a>-->
                      <el-link :underline="false" href="https://element.eleme.io" target="_blank"
                               style="font-size: 14px;color: #f87653;">··· 更多
                      </el-link>
                    </div>
                  </div>
                  <div class="item">
                    <table width="100%">
                      <tr>
                        <th class="text-align-left" style="min-width: 140px;"></th>
                        <th v-for="data in thList.aweme"
                            style="min-width: 75px;color: #999;font-weight: 400;font-size: 12px;" :key="data">{{ data }}
                        </th>
                      </tr>
                      <tr v-for="data in awemeData" :key="data" style="color: #333;">
                        <td style="text-align: left;">
                          <div style="float: left;">
                            <el-avatar :src="data.awemeAuthorAvatarMedium" size="medium"></el-avatar>
                          </div>
                          <span>&nbsp;</span>
                          <el-link href="/t1/index" target="_blank" :underline="false">
                            {{ data.awemeDesc }}
                          </el-link>
                        </td>
                        <td style="text-align: center;font-weight: 700;">{{ data.awemeStatisticsCommentCount }}</td>
                        <td style="text-align: center;font-weight: 700;">{{ data.awemeStatisticsDiggCount }}</td>
                      </tr>
                    </table>
                  </div>
                </el-card>
              </el-col>
              <el-col :span="8" style="padding: 20px 10px">
                <el-card shadow="hover" style="border-radius: 10px">
                  <div slot="header" class="clearfix" style="padding: 10px;font-weight: 600;font-size: 16px;">
                    <span>
                      热门音乐
                    </span>
                    <el-tooltip class="item" effect="dark" content="热门音乐" placement="top">
                      <svg version="1.1" viewBox="0 0 14 14" class="el-tooltip ml5 cursor-pointer svg-icon svg-fill"
                           aria-describedby="el-tooltip-4353" tabindex="0"
                           style="width: 14px; height: 14px; margin: 0 auto;">
                        <g _fill="#000" fill-rule="nonzero">
                          <path fill="#0D0D0D" stroke="none" pid="0"
                                d="M6.965.01a6.96 6.96 0 100 13.921 6.96 6.96 0 000-13.92zm4.219 11.18a5.927 5.927 0 01-4.219 1.747 5.927 5.927 0 01-4.218-1.748A5.927 5.927 0 01.999 6.971c0-1.594.621-3.092 1.748-4.219a5.927 5.927 0 014.218-1.747c1.594 0 3.092.62 4.219 1.747a5.927 5.927 0 011.747 4.219c0 1.593-.62 3.092-1.747 4.218z"></path>
                          <path fill="#0D0D0D" stroke="none" pid="1"
                                d="M9.192 5.179c0 .215-.023.404-.069.563a1.634 1.634 0 01-.198.436 2.416 2.416 0 01-.321.392 8.376 8.376 0 01-.442.41c-.148.126-.27.239-.362.334a1.58 1.58 0 00-.24.313 1.132 1.132 0 00-.13.35 2.242 2.242 0 00-.037.431c0 .07-.056.127-.126.127h-.715a.127.127 0 01-.127-.127v-.13c0-.164.012-.311.036-.438a1.515 1.515 0 01.305-.68c.085-.108.194-.227.326-.352l.487-.464c.145-.13.272-.28.377-.442.114-.176.171-.39.171-.637 0-.32-.103-.593-.306-.814-.208-.225-.5-.338-.869-.338a1.226 1.226 0 00-.91.39c-.111.12-.197.26-.254.417v.003a.414.414 0 01-.426.273l-.176-.016a.413.413 0 01-.346-.566A2.094 2.094 0 016.157 3.38c.27-.091.567-.137.883-.137.292 0 .573.043.835.127.258.084.488.21.686.373.194.161.35.364.462.603.112.237.17.518.17.833zm-3.043 4.6c0-.202.074-.377.223-.523a.738.738 0 01.536-.218c.203 0 .38.07.532.21.152.138.229.31.229.512a.707.707 0 01-.224.522.74.74 0 01-.537.219.816.816 0 01-.531-.21.7.7 0 01-.228-.512z"></path>
                        </g>
                      </svg>
                    </el-tooltip>
                    <div style="float: right; padding: 3px 0">
                      <!--          <a href="" class="" style="font-size: 14px;color: #f87653;">··· 更多</a>-->
                      <el-link :underline="false" href="https://element.eleme.io" target="_blank"
                               style="font-size: 14px;color: #f87653;">··· 更多
                      </el-link>
                    </div>
                  </div>
                  <div class="item">
                    <table width="100%">
                      <tr>
                        <th class="text-align-left" style="min-width: 140px;"></th>
                        <th v-for="data in thList.music"
                            style="min-width: 75px;color: #999;font-weight: 400;font-size: 12px;" :key="data">{{ data }}
                        </th>
                      </tr>
                      <tr v-for="data in musicData" :key="data" style="color: #333;">
                        <td style="text-align: left;">
                          <div style="float: left;">
                            <svg version="1.1" viewBox="0 0 30 30" class="svg-icon svg-fill"
                                 style="width: 25px; height: 25px;">
                              <g _fill="#2C2C2C" fill-rule="nonzero">
                                <path fill="#2C2C2C" stroke="none" pid="0"
                                      d="M15 0C6.716 0 0 6.716 0 15c0 8.284 6.716 15 15 15 8.284 0 15-6.716 15-15 0-8.284-6.716-15-15-15zm0 26.667C8.557 26.667 3.333 21.443 3.333 15S8.557 3.333 15 3.333 26.667 8.557 26.667 15A11.667 11.667 0 0115 26.667z"></path>
                                <path fill="#2C2C2C" stroke="none" pid="1"
                                      d="M11.868 15.165a3.297 3.297 0 106.594 0 3.297 3.297 0 00-6.594 0zM15 6.593v1.682A6.725 6.725 0 0121.725 15h1.682A8.407 8.407 0 0015 6.593zM8.275 15H6.593A8.407 8.407 0 0015 23.407v-1.682A6.725 6.725 0 018.275 15z"></path>
                              </g>
                            </svg>
                          </div>
                          <span>&nbsp;</span>
                          <el-link href="" target="_blank" :underline="false">{{ data.awemeMusicTitle }}</el-link>
                        </td>
                        <td style="text-align: center;font-weight: 700;">{{ data.con }}</td>
                      </tr>
                    </table>
                  </div>
                </el-card>
              </el-col>
              <el-col :span="8" style="padding: 20px 10px">
                <el-card shadow="hover" style="border-radius: 10px">
                  <div slot="header" class="clearfix" style="padding: 10px;font-weight: 600;font-size: 16px;">
                    <span>
                      热门视频
                    </span>
                    <el-tooltip class="item" effect="dark" content="热门视频2" placement="top">
                      <svg version="1.1" viewBox="0 0 14 14" class="el-tooltip ml5 cursor-pointer svg-icon svg-fill"
                           aria-describedby="el-tooltip-4353" tabindex="0"
                           style="width: 14px; height: 14px; margin: 0 auto;">
                        <g _fill="#000" fill-rule="nonzero">
                          <path fill="#0D0D0D" stroke="none" pid="0"
                                d="M6.965.01a6.96 6.96 0 100 13.921 6.96 6.96 0 000-13.92zm4.219 11.18a5.927 5.927 0 01-4.219 1.747 5.927 5.927 0 01-4.218-1.748A5.927 5.927 0 01.999 6.971c0-1.594.621-3.092 1.748-4.219a5.927 5.927 0 014.218-1.747c1.594 0 3.092.62 4.219 1.747a5.927 5.927 0 011.747 4.219c0 1.593-.62 3.092-1.747 4.218z"></path>
                          <path fill="#0D0D0D" stroke="none" pid="1"
                                d="M9.192 5.179c0 .215-.023.404-.069.563a1.634 1.634 0 01-.198.436 2.416 2.416 0 01-.321.392 8.376 8.376 0 01-.442.41c-.148.126-.27.239-.362.334a1.58 1.58 0 00-.24.313 1.132 1.132 0 00-.13.35 2.242 2.242 0 00-.037.431c0 .07-.056.127-.126.127h-.715a.127.127 0 01-.127-.127v-.13c0-.164.012-.311.036-.438a1.515 1.515 0 01.305-.68c.085-.108.194-.227.326-.352l.487-.464c.145-.13.272-.28.377-.442.114-.176.171-.39.171-.637 0-.32-.103-.593-.306-.814-.208-.225-.5-.338-.869-.338a1.226 1.226 0 00-.91.39c-.111.12-.197.26-.254.417v.003a.414.414 0 01-.426.273l-.176-.016a.413.413 0 01-.346-.566A2.094 2.094 0 016.157 3.38c.27-.091.567-.137.883-.137.292 0 .573.043.835.127.258.084.488.21.686.373.194.161.35.364.462.603.112.237.17.518.17.833zm-3.043 4.6c0-.202.074-.377.223-.523a.738.738 0 01.536-.218c.203 0 .38.07.532.21.152.138.229.31.229.512a.707.707 0 01-.224.522.74.74 0 01-.537.219.816.816 0 01-.531-.21.7.7 0 01-.228-.512z"></path>
                        </g>
                      </svg>
                    </el-tooltip>
                    <div style="float: right; padding: 3px 0">
                      <!--          <a href="" class="" style="font-size: 14px;color: #f87653;">··· 更多</a>-->
                      <el-link :underline="false" href="https://element.eleme.io" target="_blank"
                               style="font-size: 14px;color: #f87653;">··· 更多
                      </el-link>
                    </div>
                  </div>
                  <div class="item">
                    <table width="100%">
                      <tr>
                        <th class="text-align-left" style="min-width: 140px;"></th>
                        <th v-for="data in thList.user"
                            style="min-width: 75px;color: #999;font-weight: 400;font-size: 12px;" :key="data">{{ data }}
                        </th>
                      </tr>
                      <tr v-for="data in awemeData" :key="data" style="color: #333;">
                        <td style="text-align: left;">
                          <el-link href="" target="_blank" :underline="false">{{ data.awemeDesc }}</el-link>
                        </td>
                        <td style="text-align: center;font-weight: 700;">{{ data.awemeStatisticsCommentCount }}</td>
                        <td style="text-align: center;font-weight: 700;">{{ data.awemeStatisticsDiggCount }}</td>
                      </tr>
                    </table>
                  </div>
                </el-card>
              </el-col>
            </el-row>
          </div>
        </el-col>
      </el-row>
    </div>
  </div>

</template>

<script>
import {getAwemeList, getMusicList} from '@/api/douyin/home'

function formatDate(date) {
  date = new Date(Date.parse(date.replace(/-/g, "/"))); //转换成Data();
  let y = date.getFullYear();
  let m = date.getMonth() + 1;
  m = m < 10 ? '0' + m : m;
  let d = date.getDate();
  d = d < 10 ? ('0' + d) : d;
  return y + m + d;
}


export default {
  name: "newtest",
  components: {},
  data() {
    return {
      t: {},
      thList: {
        "aweme": ['评论', '点赞'],
        "music": ['使用人数'],
        "user": ['评论2', '点赞2']
      },
      input: "",
      awemeData: [],
      url: "",
      bannerLable: ["达人", "视频", "音乐"],
      currentIndex: 0,
      currentList: {"0": "请输入达人名称", "1": "请输入视频名称", "2": "请输入音乐名称"},
      musicData: []
    }
  },
  created() {
    this.awemeList();
    this.musicList();
    this.url = "http://img.elephantnote.com/static/images/" + formatDate(new Date().toLocaleDateString()) + ".jpg"
  },
  methods: {
    setIndex(index) {
      this.currentIndex = index;
    },
    awemeList() {
      getAwemeList().then(res => {
        this.awemeData = res.data.data;

        for (let i = 0; i < this.awemeData.length; i++) {
          if (this.awemeData[i].awemeStatisticsCommentCount > 10000) {
            this.awemeData[i].awemeStatisticsCommentCount = (this.awemeData[i].awemeStatisticsCommentCount / 10000).toFixed(2) + "W"
          }
          if (this.awemeData[i].awemeStatisticsDiggCount > 10000) {
            this.awemeData[i].awemeStatisticsDiggCount = (this.awemeData[i].awemeStatisticsDiggCount / 10000).toFixed(2) + "W"
          }
          if (this.awemeData[i].awemeDesc.length > 7) {
            this.awemeData[i].awemeDesc = this.awemeData[i].awemeDesc.substring(0, 7) + "..."
          }
        }
      });
    },
    musicList() {
      getMusicList().then(res => {
        // console.log(res.data.data);
        this.musicData = res.data.data;
      })
    },
    searchClick(){
      // console.log(this.currentIndex, this.$refs.searchText.value)
      this.$router.push({name: '数据搜索', params: {currentIndex: this.currentIndex, searchText: this.$refs.searchText.value}});
    }
  }
}
</script>

<style scoped>
>>> .el-input__inner {
  height: 50px;
}

>>> .banner-search .el-button {
  height: 50px;
}

>>> .el-backtop {
  z-index: 4;
}

.content-war-body {
  /*padding: 0px 10px 0px 10px;*/
}

.home-banner {
  /*height: 500px;*/
  position: static;
  display: flex;
}

.banner-war {
  position: fixed;
  top: 120px;
  left: 240px;
  right: 16.5px;
  /*width: 100%;*/
  /*min-width: 1200px;*/
  height: 500px;
  z-index: 1;
  overflow: hidden;
  bottom: 30%;
}

.banner-body {
  position: fixed;
  top: 35%;
  left: 40%;
  z-index: 3;
}

.title {
  font-size: 34px;
  color: #fff;
  font-weight: 600;
  text-align: center;
}

.content-war {
  z-index: 3;
  position: relative;
  background-color: #ffffff;
}

.el-header, .el-footer {
  background-color: #B3C0D1;
  color: #333;
  text-align: center;
  line-height: 60px;
}

.el-aside {
  background-color: #D3DCE6;
  color: #333;
  text-align: center;
  line-height: 200px;
}

.el-main {
  background-color: #E9EEF3;
  color: #333;
  text-align: center;
  line-height: 50px;
}


.el-container:nth-child(5) .el-aside,
.el-container:nth-child(6) .el-aside {
  line-height: 260px;
}

.el-container:nth-child(7) .el-aside {
  line-height: 320px;
}
</style>
