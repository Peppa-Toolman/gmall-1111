package com.toolmanclub.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.toolmanclub.gmall.ums.entity.Member;
import com.toolmanclub.gmall.ums.mapper.MemberMapper;
import com.toolmanclub.gmall.ums.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Yujie Wang
 * @since 2020-09-05
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
