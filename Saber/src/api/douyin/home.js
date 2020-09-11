import request from '@/router/axios';

export const getAwemeList = () => {
  return request({
    url: '/api/blade-douyin/douyin/home/aweme/list',
    method: 'get',
  })
}

export const getMusicList = () => {
  return request({
    url: '/api/blade-douyin/douyin/home/aweme/music',
    method: 'get',
  })
}

export const dspUserList = (name) => {
  console.log(name);
  return request({
    url: '/api/blade-douyin/douyin/user/list?name='+name,
    method: 'get',
  })
}

export const dspAwemeList = (name) => {
  console.log(name);
  return request({
    url: '/api/blade-douyin/douyin/aweme/list?name='+name,
    method: 'get',
  })
}

export const dspMusicList = (name) => {
  console.log(name);
  return request({
    url: '/api/blade-douyin/douyin/music/list?name='+name,
    method: 'get',
  })
}
