<template>
  <div>
    <el-card shadow="hover" style="border-radius: 10px">
      <div slot="header" class="clearfix" style="padding: 10px;font-weight: 600;font-size: 16px;">
        <span>
          {{ title }}
        </span>
        <el-tooltip class="item" effect="dark" :content="content" placement="top">
          <svg version="1.1" viewBox="0 0 14 14" class="el-tooltip ml5 cursor-pointer svg-icon svg-fill"
               aria-describedby="el-tooltip-4353" tabindex="0" style="width: 14px; height: 14px; margin: 0 auto;">
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
          <el-link :underline="false" href="https://element.eleme.io" target="_blank" style="font-size: 14px;color: #f87653;">··· 更多</el-link>
        </div>
      </div>
      <div class="item">
        <table width="100%">
          <tr>
            <th class="text-align-left" style="min-width: 140px;"></th>
            <th v-for="data in thList.aweme" style="min-width: 75px;color: #999;font-weight: 400;font-size: 12px;" :key="data">{{data}}</th>
          </tr>
          <tr v-for="data in newData" :key="data" style="color: #333;">
            <td style="text-align: left;">
              <el-link href="" target="_blank" :underline="false">{{ data.awemeDesc }}</el-link>
            </td>
            <td style="text-align: center;font-weight: 700;">{{ data.awemeStatisticsCommentCount }}</td>
            <td style="text-align: center;font-weight: 700;">{{ data.awemeStatisticsDiggCount }}</td>
          </tr>
        </table>
      </div>
    </el-card>
  </div>


</template>

<script>
export default {
  name: "AwemeInfo",
  props: {
    title: {
      type: String,
      default: "标题"
    },
    newData: {
      type: Array,
      default() {
        return []
      }
    },
    content: {
      type: String,
      default: ""
    },
    thList:{
      type: Map,
      default() {
        return {};
      }
    }
  }
}
</script>

<style scoped>
.text {
  font-size: 14px;
}

.item {
  margin-bottom: 18px;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}

.clearfix:after {
  clear: both
}

</style>
