<template>
<div style="height: 100%; overflow-y: scroll;background-color: #fff;">
  <el-row style="width: 1190px;margin: 0 auto;padding: 20px;">
    <el-col :span="24" style="justify-content: center;display: flex;">
      <div>
        <div style="text-align: center;">
          <label v-for="(data,index) in bannerLable" style="padding: 0 15px;" :key="index">
            <el-button v-if="index === currentIndex" size="mini" style="background-color:#1e9fff;color: hsla(0,0%,100%,.8);border:0;" round>{{ data }}</el-button>
            <el-button @click="setIndex(index)" v-else size="mini" style="background-color:transparent;color: #000;border:0;" round>{{ data }}</el-button>
          </label>
        </div>
        <br />
        <div class="banner-search">
          <el-row>
            <el-col :span="21"><div class="grid-content bg-purple"><el-input class="home-input" v-model="input" :placeholder="searchText"></el-input></div></el-col>
            <el-col :span="3"><div class="grid-content bg-purple-light"><el-button type="primary" @click="setHead">搜索</el-button></div></el-col>
          </el-row>
        </div>
      </div>
    </el-col>
    <el-col>
      <el-divider></el-divider>
    </el-col>
    <el-col :span="24">
      <el-table :data="tableData" width="100%"  border>
        <el-table-column v-for="(item,index) in tableHead" :key="index" :label="item.label" :property="item.property" align="center">
          <template slot-scope="scope">{{scope.row[scope.column.property]}}</template>
          {{item}}
        </el-table-column>
      </el-table>
    </el-col>
  </el-row>
</div>
</template>

<script>
import {dspUserList, dspAwemeList, dspMusicList} from '@/api/douyin/home'

export default {
  name: "dataSearch",
  data(){
    return {
      bannerLable: ["达人","视频","音乐"],
      currentList: {"0": "请输入达人名称","1":"请输入视频名称","2":"请输入音乐名称"},
      currentIndex: this.$route.params.currentIndex,
      searchText: this.$route.params.searchText,
      input: "",
      tableData: [],
      tableHead:[]
    }
  },
  created() {
    if (this.$route.params.searchText != undefined){
      this.input = this.$route.params.searchText;
      console.log(this.searchText);
      this.setHead();
    }
  },
  methods:{
    setIndex(index){
      this.currentIndex = index;
      this.searchText = this.currentList[index];
    },
    setHead(){
      // this.tableHead = [{label: "达人1", property: "name"}, {label: "时间1", property: "date"}, {label: "地址1", property: "address"}];
      if (this.currentIndex === 0){
        this.userList(this.searchText);
      }else if(this.currentIndex === 1){
        this.awemeList(this.searchText);
      }else if(this.currentIndex === 2){
        this.musicList(this.searchText);
      }
    },
    userList(name){
      dspUserList(name).then(res => {
        this.tableData = res.data.data;
        this.tableHead = [{label: "作者名称", property: "awemeAuthorNickname"}, {label: "粉丝", property: "awemeAuthorFollowingCount"}, {label: "点赞数", property: "awemeStatisticsDiggCount"}, {label: "分享数", property: "awemeStatisticsShareCount"}, {label: "转发数", property: "awemeStatisticsForwardCount"}]
      });
    },
    awemeList(name){
      dspAwemeList(name).then(res => {
        this.tableData = res.data.data;
        this.tableHead = [{label: "视频", property: "awemeDesc"}, {label: "发布时间", property: "awemeCreateTime"}, {label: "达人", property: "awemeAuthorNickname"}, {label: "点赞数", property: "awemeStatisticsDiggCount"}, {label: "评论数", property: "awemeStatisticsCommentCount"}]
      });
    },
    musicList(name){
      dspMusicList(name).then(res => {
        this.tableData = res.data.data;
        this.tableHead = [{label: "音乐", property: "awemeMusicTitle"}, {label: "使用人数", property: "con"}]
      })
    }
  }
}
</script>

<style scoped>
.banner-search{
  width: 625px;
}
</style>
