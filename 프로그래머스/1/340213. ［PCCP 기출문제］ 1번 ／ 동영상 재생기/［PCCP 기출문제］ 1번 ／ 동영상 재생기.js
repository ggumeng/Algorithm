function solution(video_len, pos, op_start, op_end, commands) {
    if (pos >= op_start && pos <= op_end) {
        pos = op_end;
    }
    
    commands.forEach((v) => {
        if (v === 'prev') {
            pos = prev(pos);
        }
        
        if (v === 'next') {
            pos = next(pos, video_len);
        }
        
        if (pos >= op_start && pos <= op_end) {
            pos = op_end;
        }
    })
    
    return pos;
}

function prev(pos) {
    const splitPost = pos.split(":");
    
    let splitPostFirst = Number(splitPost[0]);
    let splitPostSecond = Number(splitPost[1]);
    
    if (splitPostFirst === 0 && splitPostSecond < 10) {
        splitPostFirst = 0;
        splitPostSecond = 0;
    } else {
        splitPostSecond = splitPostSecond - 10;
        
        if (splitPostSecond < 0) {
            splitPostFirst -= 1;
            splitPostSecond += 60;
            
            if (splitPostFirst === 0 && splitPostSecond < 10) {
                splitPostFirst = 0;
                splitPostSecond = 0;
            }
        }
    }
    
    const posStart = splitPostFirst.toString().padStart(2, '0');
    const posEnd = splitPostSecond.toString().padStart(2, '0');
    
    return posStart + ":" + posEnd;
}

function next(pos, video_len) {
    const splitVideoLen = video_len.split(":");
    
    let splitVideoLenFirst = Number(splitVideoLen[0]);
    let splitVideoLenSecond = Number(splitVideoLen[1]);
    
    splitVideoLenSecond = splitVideoLenSecond - 10;
        
    if (splitVideoLenSecond < 0) {
        splitVideoLenFirst -= 1;
        splitVideoLenSecond += 60;
    }
    
    const videoStart = splitVideoLenFirst.toString().padStart(2, '0');
    const videoEnd = splitVideoLenSecond.toString().padStart(2, '0');
    
    const videoLenTemp = videoStart + ":" + videoEnd;
    
    if (pos >= videoLenTemp || pos >= video_len) {
        return video_len;
    }
    
    const splitPost = pos.split(":");
    
    let splitPostFirst = Number(splitPost[0]);
    let splitPostSecond = Number(splitPost[1]);
    
    splitPostSecond = splitPostSecond + 10;
        
    if (splitPostSecond >= 60) {
        splitPostFirst += 1;
        splitPostSecond -= 60;
    }
    
    const posStart = splitPostFirst.toString().padStart(2, '0');
    const posEnd = splitPostSecond.toString().padStart(2, '0');
    
    const posTemp = posStart + ":" + posEnd;
    
    return posTemp;
}