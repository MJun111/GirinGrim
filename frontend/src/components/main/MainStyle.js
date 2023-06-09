/**메인화면 컴포넌트 style */
import styled from "styled-components";

export const MainContainer = styled.div`
  display: flex;
  justify-content: center;
  width: 100vw;
  height: 90vh;
`;

// 동화나라
export const FairyContent = styled.div`
  width: 20vw;
  height: 45vh;
  background: #ff8f5c;
  margin-top: 35vh;
  margin-left: 1vw;
  margin-right: 1vw;
  border-radius: 10%;
  :hover {
    box-shadow: 5px 5px 5px gray;
  }
`;

// 그림일기
export const DiaryContent = styled.div`
  width: 20vw;
  height: 45vh;
  background: #8bd0fc;
  margin-top: 35vh;
  margin-left: 1vw;
  margin-right: 1vw;
  border-radius: 10%;
  :hover {
    box-shadow: 5px 5px 5px gray;
  }
`;

// 스케치북
export const SketchContent = styled.div`
  width: 20vw;
  height: 45vh;
  background: #b6f960;
  margin-top: 35vh;
  margin-left: 1vw;
  margin-right: 1vw;
  border-radius: 10%;
  :hover {
    box-shadow: 5px 5px 5px gray;
  }
`;

export const ContentName = styled.p`
  margin-left: 2vw;
  margin-top: 35vh;
  width: auto;
  font-size: 6vh;
  height: 6vh;
  color: #ffffff;
`;

export const ImageContainer = styled.img`
  position: absolute; /* ImageContainer 컴포넌트에 상대 위치 설정 */
  bottom: 25%; /* 컨테이너의 중앙에 위치시키기 위해 top과 left 속성을 조정합니다. */
  width: 20%;
`;
